# Extension Validation Report

- Extension: tachiyomi-pt.kamisamaexplorer-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 22
- Lint: 1
- Warnings: 1
- Skipped: 10
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5221484950287110636
- Source name: Kami Sama Explorer
- Source language: pt-BR
- Selected manga input: popular offset 0: Dragon Ball Super (`.../19`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Dragon Ball Super (`.../19`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 9 | BattleMan F-1 Nishi Doitsu Hockenheim GP Kanshinki (`.../208`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Dragon Ball GT – DBGalaxyTouring (`.../291`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 9 | Super Dragon Ball Heroes Universe Mission!! (`.../74`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 13 | Dragon Ball Super Divers (`.../268`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 106 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 3: title=Dragon Ball Super, URL=`19` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 78/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leitor.kamisama.com.br/.../dragon-ball-super-capa-volume-12-175x238.jpg` (image/jpeg, 14217 bytes, 175x238) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 106 chapters |  |  |  |
| chapter dates | LINT | 1 of 106 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `capitulo-32` at offsets 72, 73, `capitulo-31` at offsets 74, 75 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
