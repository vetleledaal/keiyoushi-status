# Extension Validation Report

- Extension: tachiyomi-pt.mangalivreblog-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 588678420372440028
- Source name: Manga Livre Blog
- Source language: pt-BR
- Selected manga input: popular offset 0: Trapped in the Academy’s Eroge (`.../trapped-in-the-academys-eroge`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Trapped in the Academy’s Eroge (`.../trapped-in-the-academys-eroge`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Dandadan (`.../dandadan`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | Escravo Das Sombras (`.../escravo-das-sombras`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 21 | Colorista (`.../colorista`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Trapped in the Academy’s Eroge (`.../trapped-in-the-academys-eroge`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 120 | Capítulo 1 (`.../trapped-in-the-academys-eroge-capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| latest listing | PASS | 21 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangalivre.blog/.../cover-001-b19f0437-350x500.webp` (image/webp (encoding: lossy), 116684 bytes, 600x840) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../trapped-in-the-academys-eroge` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mangalivre.blog/.../cover-001-b19f0437.webp` was not downloaded |  |  |  |
| details author | PASS | Feel, MALPOI |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | He left a really negative review on a hentai game… Only to wake up as the main character! To make things worse, he will be killed by the god of games unless he gets all 6 girls in the game to fall for him! _”Damn it… Fine, I’ll do whatever it takes to get all the girls!”_ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 120 chapters |  |  |  |
| chapter dates | PASS | 120 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangalivre.blog/.../1 <redacted query values: ordem>` to `https://mangalivre.blog/.../manga <redacted query values: ordem>` (1 redirects) |  |  |  |
| page load | PASS | `https://pub-fd34549394dd487c833b561317c11eed.r2.dev/.../page-001-4c8f1edd.webp` (image/webp (encoding: lossy), 165438 bytes, 1280x720) |  |  |  |
