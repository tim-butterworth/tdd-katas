const path = require("path");
const {jasmineCommandLinePlugin} = require("./custom-plugins/jasmineCustomPlugin");

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
const conceptsConfig = {
    entry: {
        "const-let": "./src/core-concepts/const-let.ts",
        "object-literals": "./src/core-concepts/object-literals.ts",
        "destructuring": "./src/core-concepts/destructuring.ts",
        "spread-operator": "./src/core-concepts/spread-operator.ts",
        "types-and-interfaces": "./src/core-concepts/types-and-interfaces.ts",
        "classes": "./src/core-concepts/classes.ts",
        "functions-arrow-functions": "./src/core-concepts/functions-arrow-functions.ts",
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
                        options: {configFile: 'tslint.json'}
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
    tickTackToe: tickTackToeConfig,
    plinkPlonkPlunk: plinkPlonkPlunkConfig,
}
const selectedConfig = configSelectionMap[tsSelection];

if (!selectedConfig) {
    console.log("Please select one of the valid options for TS_SELECTION: ", Object.keys(configSelectionMap));
    process.exit(1);
}

module.exports = Object.assign({}, coreConfig, selectedConfig);
