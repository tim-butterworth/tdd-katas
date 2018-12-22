const path = require("path");
const {
    jasmineCommandLinePlugin
} = require("./custom-plugins/jasmineCustomPlugin");

const tsSelection = process.env.TS_SELECTION || "concepts";

const withTests = (config) => Object.assign({}, config, {
    output: {
        filename: "bundle.spec.js",
        path: path.resolve(__dirname, "dist")
    },
    plugins: [jasmineCommandLinePlugin]    
});
const tickTackToeConfig = withTests({
    entry: "./src/tick-tack-toe/tick-tack-toe.spec.ts"
});
const plinkPlonkPlunkConfig = withTests({
    entry: "./src/plink-plonk-plunk/plink-plonk-plunk.spec.ts"
});
const toDoConfig = withTests({
    entry: "./src/to-do/to-do.spec.ts"
});
const toDoStatelessConfig = withTests({
    entry: "./src/to-do-stateless/to-do-stateless.spec.ts"
});
const sortConfig = withTests({
    entry: "./src/sort/sort-machine.spec.ts"
});
const conceptsConfig = {
    entry: {
        "const-let": "./src/core-concepts/typescript/const-let.ts",
        "object-literals": "./src/core-concepts/typescript/object-literals.ts",
        "destructuring": "./src/core-concepts/typescript/destructuring.ts",
        "spread-operator": "./src/core-concepts/typescript/spread-operator.ts",
        "types-and-interfaces": "./src/core-concepts/typescript/types-and-interfaces.ts",
        "classes": "./src/core-concepts/typescript/classes.ts",
        "functions-arrow-functions": "./src/core-concepts/typescript/functions-arrow-functions.ts",
    },
    output: {
        filename: "[name]-bundle.js",
        path: path.resolve(__dirname, "dist")
    },
    plugins: [],
};
const observableConfig = {
    entry: {
        "create": "./src/core-concepts/observables/create.ts",
    },
    output: {
        filename: "[name]-bundle.js",
        path: path.resolve(__dirname, "dist")
    },
    plugins: [],
};

const coreConfig = {
    devtool: "inline-source-map",
    mode: "development",
    node: {
        fs: "empty"
    },
    module: {
        rules: [
            {
                test: /\.ts?$/,
                use: "ts-loader",
                exclude: /node_modules/
            },
            {
                test: /\.ts$/,
                enforce: 'pre',
                use: [
                    {
                        loader: 'tslint-loader',
                        options: {
			    configFile: 'tslint.json'
			}
                    }
                ]
            }
        ]
    },
    resolve: {
        extensions: [".ts", ".js"]
    },
};

const configSelectionMap = {
    concepts: conceptsConfig,
    observables: observableConfig,
    tickTackToe: tickTackToeConfig,
    plinkPlonkPlunk: plinkPlonkPlunkConfig,
    toDo: toDoConfig,
    toDoStateless: toDoStatelessConfig,
    sort: sortConfig,
}
const selectedConfig = configSelectionMap[tsSelection];

if (!selectedConfig) {
    console.log("Please select one of the valid options for TS_SELECTION: ", Object.keys(configSelectionMap));
    process.exit(1);
}

module.exports = Object.assign({}, coreConfig, selectedConfig);
