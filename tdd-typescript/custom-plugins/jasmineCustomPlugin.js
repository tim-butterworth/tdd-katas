const path = require("path");
const _ = require("lodash");
const TSConsoleReporter = require("jasmine-ts-console-reporter");
const Command = require("../node_modules/jasmine/lib/command.js");
const Jasmine = require("../node_modules/jasmine/lib/jasmine.js");
const decache = require("decache");

const examplesDir = path.join(
    path.dirname(require.resolve('jasmine-core')),
    'jasmine-core',
    'example',
    'node_example'
);
const command = new Command(path.resolve(), examplesDir, console.log);
const resetSpecFileImports = (jasmine) => _.get(jasmine, 'specFiles', []).forEach((file) => {
    decache(file);
});
const redefineExit = (jasmine) => {
    jasmine.exit = (code) => { console.log(`exit was called with code [${code}]`); }
}
const getWatchRelatedFuns = (args) => {
    if (_.find(args, (arg) => "--watch" === arg)) {
	return {
	    redefineExit,
	    resetSpecFileImports
	}
    } else {
	return {
	    redefineExit: _.noop,
	    resetSpecFileImports: _.noop
	}
    }
};
const getProcessArguments = () => process.argv
const getConfiguredJasmine = () => {
    const jasmine = new Jasmine({ projectBaseDir: path.resolve() });

    jasmine.clearReporters();
    jasmine.addReporter(new TSConsoleReporter());

    return jasmine;
}

const jasmineCommandLinePlugin = {
    apply: (compiler) => {
	compiler.hooks.afterEmit.tapAsync("Jasmine Custom Plugin", (compiler, callback) => {
	    const jasmine = getConfiguredJasmine();
	    const watchRelatedFuns = getWatchRelatedFuns(getProcessArguments())

	    watchRelatedFuns.redefineExit(jasmine);
	    command.run(jasmine, []);
	    watchRelatedFuns.resetSpecFileImports(jasmine);

	    callback();
	});
    }
}

module.exports = { jasmineCommandLinePlugin };
