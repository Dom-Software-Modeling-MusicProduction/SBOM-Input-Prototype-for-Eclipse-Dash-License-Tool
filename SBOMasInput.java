
public class SBOMasInput {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SBOMasInput <sbom-file>");
            return;
        }

        String sbomFile = args[0];
        //current program accepts:
        // - SPDX SBOM in JSON format
        // - SPDX SBOM in XML format
        // - CycloneDX SBOM in JSON format
        // - CycloneDX SBOM in XML format
        try {
            Parser parser;

            if (sbomFile.endsWith(".json")) {
                parser = new JsonParser();
            } else {
                parser = new XmlParser();
            }

            Bom bom = parser.parse(new File(sbomFile));

            System.out.println("Successfully parsed SBOM: "
                    + bom.getMetadata().getComponent().getName());

        }
        catch (Exception e) {
            System.err.println("Error parsing SBOM file: " + e.getMessage());
        }
        //need to add support for SPDX parsing as well, which may require a different parser or library


    }
    //need to accept xml and json formats for both SPDX and CycloneDX, so we will not use the file extension to determine the parser type

    private static String normalizeIdentifier(String identifier) {
        if (identifier.startsWith("DocumentRef-")) {
            return identifier;
        }
        return identifier.toLowerCase();
    }
}
