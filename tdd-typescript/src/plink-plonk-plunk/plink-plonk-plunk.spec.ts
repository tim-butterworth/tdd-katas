import { plinkPlonkPlunk } from "./plink-plonk-plunk";

describe("plinkPlonkPlunk", () => {
    describe("returns 'plink'", () => {
        it("for 3", () => {
            expect(plinkPlonkPlunk(3)).toEqual("plink");
        });
    });
});
