# Extension Validation Report

- Extension: tachiyomi-en.mangapdf-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1578380270112593951
- Source name: MANGAPDF
- Source language: en
- Selected manga input: popular offset 0: The Rebellious Villainess Doesn’t Want To Be Swayed By The Obsessive Prince! (`.../00mdhbnsje4z3t3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | The Rebellious Villainess Doesn’t Want To Be Swayed By The Obsessive Prince! (`.../00mdhbnsje4z3t3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | A Fortune-Telling Princess (`.../0fqo9vmz7xc8kzy`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Love Letter From the Future (`.../833jo4kq5udgsf0`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | The Manor Awaits Spring (`.../hkocwje6qw986fc`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Rebellious Villainess Doesn’t Want To Be Swayed By The Obsessive Prince! (`.../00mdhbnsje4z3t3`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Rebellious Villainess Doesn’t Want To Be Swayed By The Obsessive Prince! (`.../00mdhbnsje4z3t3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 56 | Chapter 1 (`.../pgcjvphgtnrqk9v`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Rebellious Villainess Doesn’t Want To Be Swayed By The Obsessive Prince!, URL=`00mdhbnsje4z3t3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.coffeemanga.shop/.../cover.jpg <redacted query values: fit, format, q, and w>` (image/jpeg, 24116 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `00mdhbnsje4z3t3` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.coffeemanga.shop/.../cover.jpg <redacted query values: fit, format, q, and w>` |  |  |  |
| details author | PASS | Rohdea |  |  |  |
| details artist | PASS | Takasaki itsuki |  |  |  |
| details genres | PASS | Fantasy, Full color, Josei, Manga, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 56 chapters |  |  |  |
| chapter dates | LINT | All 56 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=56 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.coffeemanga.shop/.../p001.jpg` (image/jpeg, 572429 bytes, 800x7140) |  |  |  |
