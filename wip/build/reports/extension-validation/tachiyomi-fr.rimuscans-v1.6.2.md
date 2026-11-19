# Extension Validation Report

- Extension: tachiyomi-fr.rimuscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 203984087587807085
- Source name: Rimu Scans
- Source language: fr
- Selected manga input: popular offset 0: Medical Rebirth (`.../medical-rebirth`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Medical Rebirth (`.../medical-rebirth`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | A Mercenary’s Rebirth Among Nobles (`.../a-mercenarys-rebirth-among-nobles`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Greatest Estate Developer (`.../the-greatest-estate-developer`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Infinite Mage (`.../infinite-mage`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Medical Rebirth (`.../medical-rebirth`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Medical Rebirth (`.../medical-rebirth`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 148 | Chapitre 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Medical Rebirth, URL=`.../medical-rebirth` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Red Shirt, URL=`.../red-shirt` at page 1 offset 5 and page 2 offset 7, title=Return of the 8th class Magician, URL=`.../return-of-the-8th-class-magician` at page 1 offset 6 and page 2 offset 14, title=The Monster Lady and the Holy Knight, URL=`.../the-monster-lady-and-the-holy-knight` at page 1 offset 8 and page 2 offset 8, title=The Boxer, URL=`.../the-boxer` at page 1 offset 17 and page 2 offset 16, title=Martial Peak, URL=`.../martial-peak` at page 1 offset 18 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rimuscan.fr/.../cover-1792619973507.webp` (image/webp (container: extended), 276078 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../medical-rebirth` |  |  |  |
| details thumbnail URL | PASS | `https://rimuscan.fr/.../cover-1792619973507.webp` |  |  |  |
| details author | PASS | Yuin |  |  |  |
| details artist | PASS | Kidari studio |  |  |  |
| details genres | PASS | Manhwa, Action, Drame, Seinen, Surnaturel |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Kim Ji Hyun, qui a vécu sa vie en tant que chirurgien de mauvaise réputation, gagne une seconde chance de revivre sa vie. Il retourne ensuite à ses années de collège et vit sa vie comme jamais auparavant, il étudie sans arrêt. Son objectif est de devenir un dermatologue qui gagne beaucoup d’argent au lieu du pauvre chirurgien qu’il était de sa vie précédente !<br><br>Titres alternatifs : 메디컬 환생, Medical Return |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | PASS | 148 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rimuscan.fr/.../credits-page.png <redacted query values: v>` (image/png, 45913 bytes, 704x366) |  |  |  |
