# Extension Validation Report

- Extension: tachiyomi-fr.scanreader-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 25
- Lint: 0
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: scanreader
- Source ID: 6450715347254021327
- Source name: Scan Reader
- Source language: fr
- Selected manga input: popular offset 0: Killing Darling Baby-Ying♡ (`.../killing-darling-baby-ying%E2%99%A1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Killing Darling Baby-Ying♡ (`.../killing-darling-baby-ying%E2%99%A1`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 13 | La présidente, l’alcool et les étoiles (`.../shachou-to-sake-to-hoshi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | À jamais chères premières fois : Voici comment après chaque pari, mon amie d’enfance me les a toutes volées (`.../a-jamais-cheres-premieres-fois-voici-comment-apres-chaque-pari-mon-amie-denfance-me-les-a-toutes-volees`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Trait Hoarder (`.../trait-hoarder`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Killing Darling Baby-Ying♡ (`.../killing-darling-baby-ying%E2%99%A1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Killing Darling Baby-Ying♡ (`.../killing-darling-baby-ying%E2%99%A1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.IllegalArgumentException: Unexpected char 0x2661 at 55 in Referer value: https://scanreader.net/.../killing-darling-baby-ying%E2%99%A1 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.IllegalArgumentException: Unexpected char 0x2661 at 55 in Referer value: https://scanreader.net/.../killing-darling-baby-ying%E2%99%A1 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Killing Darling Baby-Ying♡, URL=`.../killing-darling-baby-ying%E2%99%A1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scanreader.net/.../thumbnail_IMAG21_f56c55ff-7ecf-444f-bc52-f5ec24bbad6f-231x300.jpg` (image/jpeg, 50939 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../killing-darling-baby-ying%E2%99%A1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://scanreader.net/.../thumbnail_IMAG21_f56c55ff-7ecf-444f-bc52-f5ec24bbad6f.jpg` was not downloaded |  |  |  |
| details author | PASS | Whale-chan, Silver Chocolate |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comédie, Drame, Long Strip, Mafia, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The last order of the dead boss. “Protect my daughter!” Jason, a false killer who flew in from Mexico, starts a parenting mission in Suyu-dong, Seoul! But is a three-year-old kid scarier than a boss?! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
