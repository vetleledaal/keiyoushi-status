# Extension Validation Report

- Extension: tachiyomi-en.onlythebesthentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5862792365006156918
- Source name: Only The Best Hentai
- Source language: en
- Selected manga input: popular offset 0: Breeding License: The “Picking Up Girls on the Beach and Having Wild Sex” Edition (`.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Breeding License: The “Picking Up Girls on the Beach and Having Wild Sex” Edition (`.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Confession Hole after (`.../confession-hole-after`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Breeding License: The “Picking Up Girls on the Beach and Having Wild Sex” Edition (`.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Breeding License: The “Picking Up Girls on the Beach and Having Wild Sex” Edition (`.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter [94 pages] (`.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition`) |  | <1s |
| pages | `getPageList(chapter)` | success | 94 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Breeding License: The “Picking Up Girls on the Beach and Having Wild Sex” Edition, URL=`.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://onlythebesthentai.com/.../1-12-768x1084.webp` (image/webp (encoding: lossy), 123714 bytes, 768x1084) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://onlythebesthentai.com/.../1-12.webp` (image/webp (encoding: lossy), 241076 bytes, 1280x1807) |  |  |  |
| details author | PASS | Minamihama Yoriko |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big tits, blowjob, creampie, editor's choice, fingering, handjob, NTR, squirting, swallowing, swimsuit |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Parody: Original<br>Pages: 94<br><br>Breeding License: The “Picking Up Girls on the Beach and Having Wild Sex” Edition, only top 5% of man receive a special license for breeding with every girl they want, how fun it would be to have one of it |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 94 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://onlythebesthentai.com/.../1-12.webp` (image/webp (encoding: lossy), 241076 bytes, 1280x1807) |  |  |  |
