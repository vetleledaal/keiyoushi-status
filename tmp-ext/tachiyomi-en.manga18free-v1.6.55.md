# Extension Validation Report

- Extension: tachiyomi-en.manga18free-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4446818596127611511
- Source name: Manga18Free
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../1028`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Stop Smoking (`.../1028`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Prison Revenge (`.../1633`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Money Games (`.../2230`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The owner of the deserted island (`.../2381`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Stop Smoking (`.../1028`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../1028`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 180 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking, URL=`1028` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga18free.com/.../Stop-Smoking-175x238.png` (image/png, 75750 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1028` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga18free.com/.../Stop-Smoking-193x278.png` (image/png, 93143 bytes, 193x278) |  |  |  |
| details author | PASS | AA |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Adult, Drama, Manhwa, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | To regain his peace, Gangchan must welcome his blood-curdling, smoking neighbor and her housemates into his home.<br><br>Alternative Names: Stop Smoking/ Deja de fumar/ DEJA DE FUMAR/ Don't smok/ Dont smok/ Don't smoke/ Someone Stop Her/ ¡Deja De Fumar! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 180 chapters |  |  |  |
| chapter dates | LINT | 46 of 180 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=46 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://manga18free.com/.../01_result01.jpg` (image/jpeg, 205209 bytes, 720x7980) |  |  |  |
