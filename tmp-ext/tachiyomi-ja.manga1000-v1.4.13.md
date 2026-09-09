# Extension Validation Report

- Extension: tachiyomi-ja.manga1000-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 29
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2990178902658283254
- Source name: Manga1000
- Source language: ja
- Selected manga input: popular offset 0: SAIKYOU ONNA SHISHОU-TACHI GA IKUSEI HOUSHIN O MEGUTTE SHURABA (`.../manga-saikyou-onna-shishu-tachi-ga-ikusei-houshin-o-megutte-shuraba`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | SAIKYOU ONNA SHISHОU-TACHI GA IKUSEI HOUSHIN O MEGUTTE SHURABA (`.../manga-saikyou-onna-shishu-tachi-ga-ikusei-houshin-o-megutte-shuraba`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | DATSUHOU TAMER NO NARIAGARI BOUKENTAN: S RANK BISHOUJO BOUKENSHA GA ORE NO JUUMA NI NA TAMERS (MANGA) (`.../manga-datsuhou-tamer-no-nariagari-boukentan-s-rank-bishoujo-boukensha-ga-ore-no-juuma-ni-na-tamers-manga`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | SAIKYOU ONNA SHISHОU-TACHI GA IKUSEI HOUSHIN O MEGUTTE SHURABA (`.../manga-saikyou-onna-shishu-tachi-ga-ikusei-houshin-o-megutte-shuraba`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | SAIKYOU ONNA SHISHОU-TACHI GA IKUSEI HOUSHIN O MEGUTTE SHURABA (`.../manga-saikyou-onna-shishu-tachi-ga-ikusei-houshin-o-megutte-shuraba`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 162 | Chapter 1 (`.../1381268`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 62 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=SAIKYOU ONNA SHISHОU-TACHI GA IKUSEI HOUSHIN O MEGUTTE SHURABA, URL=`.../manga-saikyou-onna-shishu-tachi-ga-ikusei-houshin-o-megutte-shuraba` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i4.hachiraw.win/.../67053_6130f67a88d82.jpg` (image/png, 138803 bytes, 200x283; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-saikyou-onna-shishu-tachi-ga-ikusei-houshin-o-megutte-shuraba` |  |  |  |
| details thumbnail URL | PASS | `https://i4.hachiraw.win/.../67053_6130f67a88d82.jpg` |  |  |  |
| details author | PASS | Hirotaka AKAGI |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Ecchi, Fantasy, Harem, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Updating<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 162 chapters |  |  |  |
| chapter dates | LINT | All 162 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=162 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://p16-sg.tiktokcdn.com/.../c9def63e363c9a2eecf498005380ce78` (image/png, 1472072 bytes, 960x1361) |  |  |  |
