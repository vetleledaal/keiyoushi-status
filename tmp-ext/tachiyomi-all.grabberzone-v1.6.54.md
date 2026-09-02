# Extension Validation Report

- Extension: tachiyomi-all.grabberzone-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7008887237419113673
- Source name: Grabber Zone
- Source language: all
- Selected manga input: popular offset 0: IDW Sonic The Hedgehog (#1-87) (`.../3102`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | IDW Sonic The Hedgehog (#1-87) (`.../3102`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Sonic Boom (`.../1470`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | IDW Sonic The Hedgehog (#1-87) (`.../3102`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Sonic X Shadow TOKYO MISSION Manga (`.../8434`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | IDW Sonic The Hedgehog (#1-87) (`.../3102`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | IDW Sonic The Hedgehog (#1-87) (`.../3102`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 88 | Sonic The Hedgehog #01 (`.../sonic-the-hedgehog-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=IDW Sonic The Hedgehog (#1-87), URL=`3102` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://grabber.zone/.../thumb-4105-175x238.jpg` (image/jpeg, 19132 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `3102` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://grabber.zone/.../thumb-4105-193x278.jpg` (image/jpeg, 24228 bytes, 193x278) |  |  |  |
| details author | PASS | Evan Stanley, Ian Flynn |  |  |  |
| details artist | PASS | Adam Bryce Thomas, Evan Stanley, Jennifer Hernandez, Tracy Yardley |  |  |  |
| details genres | PASS | IDW Sonic, Main Canon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sonic the Hedgehog is an ongoing American comic book series based on the Sega video game franchise, published by IDW Publishing. It is the third licensed comic book iteration based on Sega’s intellectual property, after Fleetway Publications’ Sonic the Comic and Archie Comics’ Sonic the Hedgehog series.<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 88 chapters |  |  |  |
| chapter dates | LINT | 84 of 88 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=84 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://grabber.zone/.../Sonic-The-Hedgehog-(2018-)-001-000.jpg` (image/jpeg, 1094382 bytes, 1988x3056) |  |  |  |
