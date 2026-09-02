# Extension Validation Report

- Extension: tachiyomi-pt.ninjascan-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4392067503694697213
- Source name: Ninja Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Princípe Dragão Sagrado (`.../1845`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Princípe Dragão Sagrado (`.../1845`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | O Antigo Soberano da Eternidade (`.../2047`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Princípe Dragão Sagrado (`.../1845`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Princípe Dragão Sagrado (`.../1845`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1305 | Capítulo 00 (`.../capitulo-00`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Princípe Dragão Sagrado, URL=`1845` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ninjacomics.xyz/.../ChatGPT-Image-15-de-jan.-de-2026-23_07_44-175x238.png` (image/png, 83971 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1845` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ninjacomics.xyz/.../ChatGPT-Image-15-de-jan.-de-2026-23_07_44.png` (image/png, 1730427 bytes, 1024x1536) |  |  |  |
| details author | PASS | Tian Can Tou Du |  |  |  |
| details artist | PASS | Dr. Da Ji |  |  |  |
| details genres | PASS | Ação, Comedia, Fantasia, Manhua, Romance, Principe Dragão Sagrado, Yuan Zun, Yuan Zun Ninja |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | O jovem balança seu pincel, o dragão dança. Com suas garras ele rasga o caos e ilumina os céus. A grande serpente engolirá o dragão ou este último se erguerá sobre o mundo?!<br><br>Nomes alternativos: Yuan Zun, Dragon Prince Yuan, 元尊 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1305 chapters |  |  |  |
| chapter dates | LINT | 70 of 1305 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=70 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ninjacomics.xyz/.../1.webp` (image/webp (encoding: lossy), 161772 bytes, 800x1133) |  |  |  |
