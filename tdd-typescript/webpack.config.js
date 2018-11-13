const path = require("path");
const {jasmineCommandLinePlugin} = require("./custom-plugins/jasmineCustomPlugin");

module.exports = {
    entry: {
        "const-let": "./src/core-concepts/const-let.ts",
        "object-literals": "./src/core-concepts/object-literals.ts",
        "destructuring": "./src/core-concepts/destructuring.ts",
        "spread-operator": "./src/core-concepts/spread-operator.ts",
        "types-and-interfaces": "./src/core-concepts/types-and-interfaces.ts",
        "classes": "./src/core-concepts/classes.ts",
        "functions-arrow-functions": "./src/core-concepts/functions-arrow-functions.ts",
    },
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
    output: {
        filename: "[name]-bundle.js",
        path: path.resolve(__dirname, "dist")
    },
    plugins: [jasmineCommandLinePlugin]
};
