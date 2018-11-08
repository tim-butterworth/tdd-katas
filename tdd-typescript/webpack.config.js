const path = require("path");
const { jasmineCommandLinePlugin } = require("./custom-plugins/jasmineCustomPlugin");

module.exports = {
    entry: "./src/plink-plonk-plunk/plink-plonk-plunk.spec.ts",
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
                        options: { configFile: 'tslint.json' }
                    }
                ]
            }
	]
    },
    resolve: {
	extensions: [ ".ts", ".js" ]
    },
    output: {
	filename: "bundle.spec.js",
	path: path.resolve(__dirname, "dist")
    },
    plugins: [jasmineCommandLinePlugin]
};
