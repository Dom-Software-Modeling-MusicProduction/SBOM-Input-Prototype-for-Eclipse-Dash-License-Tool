

# SBOM Input Prototype for Eclipse Dash License Tool

This repository contains early-stage development work to add SBOM (Software Bill of Materials) input support to the Eclipse Dash License Tool.

## Overview

The goal of this project is to enable the Dash License Tool to accept SBOM files as input, specifically in CycloneDX and SPDX formats. This would allow the tool to analyze dependencies and licensing information directly from standardized SBOM files, rather than relying solely on build files such as Maven or NPM for licensing information.

This work is part of my GSoC proposal.

## Current Functionality

- Basic command-line interface for accepting an SBOM file as input
- Parsing support for SBOM files in:
  - JSON format
  - XML format
- Initial use of CycloneDX parsing libraries
- Extraction of basic metadata from parsed SBOM files

## Example Usage

java SBOMasInput my-sbom.json

If successful, the program will parse the SBOM file and print basic metadata information.

## Work in Progress

This is an early prototype. Planned improvements include:

- Full support for both CycloneDX and SPDX formats
- More robust parsing logic across formats
- Extraction of dependency and licensing data
- Integration with the Dash License Tool workflow
- Support for enriched SBOM output

## Notes

This repository is intended as a prototype and will hopefully expand to a larger implementation. This code is still evolving and may change as the project develops.
