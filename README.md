# TopggDSL - A Domain-Specific Language for Discord Bot Reviews

Created by **Zobaiya Hasan (K20073377)**  
For the Model-Driven Development coursework @ King’s College London

---

## Overview

**TopggDSL** is a textual domain-specific language (DSL) designed to represent Discord bot listings and structured moderation reviews — inspired by workflows used on [Top.gg](https://top.gg). It allows Discord bot reviewers to define consistent, machine-readable profiles that can be validated and transformed into formats like JSON for automation or dashboard display.

---

## Features

- Define bot listings with tags, prefix, and description
- Write structured reviews linked to bots
- Cross-reference bot names in reviews
- Built-in validation for missing fields or invalid links
- Automatic JSON generation via `output.json`

---

## Example `.topgg` File

```topgg
name "Music"
prefix "!"
tags "music", "radio"
description "24/7 chill lo-fi beats for studying."

review "123456"
refersTo Music
status approved
reason "MusicBot was online, played music, and followed all guidelines."
reviewer "IXZ"
```

---

## Validation

The following rules are automatically checked as the user types:

- Reviews must refer to a valid bot
- Each bot must have at least one tag
- Review reason must not be empty

These are implemented in `TopggDSLValidator.xtend`.

---

## Execution & Code Generation

When you save a `.topgg` file in the DSL editor:

- Xtext parses and validates the file in real time
- A `output.json` file is automatically generated containing all bots and reviews in structured JSON format

You can find the generator logic in `TopggDSLGenerator.xtend`.

---

## How to Run

1. Open the project in Eclipse with Xtext installed
2. Run the `GenerateTopggDSL.mwe2` workflow
3. Launch the DSL via `Run > Run Configurations > Eclipse Application`
4. In the runtime Eclipse, create a new project and add a `.topgg` file
5. Save the file to trigger validation and JSON output

---

## Project Structure

| File/Folder                    | Purpose                              |
|-------------------------------|--------------------------------------|
| `TopggDSL.xtext`              | Grammar definition                   |
| `TopggDSLValidator.xtend`     | Validation rules                     |
| `TopggDSLGenerator.xtend`     | JSON output logic                    |
| `test.topgg`                  | Example input                        |
| `output.json`                 | Generated output                     |

---

## Reflection

TopggDSL is aligned closely with how real Top.gg moderators and reviewers manage content. It reduces errors, encourages structure, and opens doors for automation — showing how model-driven approaches can be used in practical, real-world scenarios.
