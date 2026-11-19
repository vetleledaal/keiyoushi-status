# Extension Validation Report

- Extension: tachiyomi-en.lusttoon-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5466172882050312169
- Source name: LustToon
- Source language: en
- Selected manga input: popular offset 0: Atonement, For Your Cruelty (`.../atonement-for-your-cruelty`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Atonement, For Your Cruelty (`.../atonement-for-your-cruelty`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Mobsters at the Bathhouse (`.../the-mobsters-at-the-bathhouse`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Legitimate Wife (`.../the-legitimate-wife`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Act Out (`.../act-out`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Atonement, For Your Cruelty (`.../atonement-for-your-cruelty`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Atonement, For Your Cruelty (`.../atonement-for-your-cruelty`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 33 | Chapter 0 (`.../chapter-0`) |  | <1s |
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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Atonement, For Your Cruelty, URL=`.../atonement-for-your-cruelty` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Legitimate Wife, URL=`.../the-legitimate-wife` at page 1 offset 0 and page 2 offset 8, title=One-Way Mind Link, URL=`.../one-way-mind-link` at page 1 offset 1 and page 2 offset 7, title=Love:Zero, URL=`.../lovezero` at page 1 offset 2 and page 2 offset 9, title=Even If You Run Away, My Love, URL=`.../even-if-you-run-away-my-love` at page 1 offset 5 and page 2 offset 10, title=My Husband Didn't Want A Pregnancy, URL=`.../my-husband-didnt-want-a-pregnancy` at page 1 offset 6 and page 2 offset 11, title=Act Out, URL=`.../act-out` at page 1 offset 7 and page 2 offset 0, title=The Pregnancy Trap, URL=`.../the-pregnancy-trap` at page 1 offset 8 and page 2 offset 13, title=Becoming An Orchid, URL=`.../becoming-an-orchid` at page 1 offset 9 and page 2 offset 15, title=Plase Forget me, URL=`.../plase-forget-me` at page 1 offset 10 and page 2 offset 16, title=Portrait of Arrogance, URL=`.../portrait-of-arrogance` at page 1 offset 11 and page 2 offset 14, title=Survival Instinct, URL=`.../survival-instinct` at page 1 offset 12 and page 2 offset 12, title=The Priestess of Dahalen, URL=`.../the-priestess-of-dahalen` at page 1 offset 13 and page 2 offset 20, title=Her Merry Obsession, URL=`.../her-merry-obsession` at page 1 offset 14 and page 2 offset 19, title=Untitled, URL=`.../untitled` at page 1 offset 15 and page 2 offset 22, title=The Witch of Paitan, URL=`.../the-witch-of-paitan` at page 1 offset 16 and page 2 offset 23 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lustoon.com/.../d862b362-3f3c-4d4c-ad18-7adc8aa78db2.jpg` (image/jpeg, 285459 bytes, 960x1392) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../atonement-for-your-cruelty` |  |  |  |
| details thumbnail URL | PASS | `https://media.lustoon.com/.../d862b362-3f3c-4d4c-ad18-7adc8aa78db2.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Extranjero, Historia, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From the moment she set foot on a strange continent, Seo-Ah wasn't given a moment to rest. With a single "key" in her hand, her life is thrown into endless pursuit and threats. And the man who desperately desires that key is Oscar Reichinhardt. Notorious for his coldness and cruelty, the man was wary of Seo-Ah from the start, but at some point, his gaze begins to subtly change. A relationship where they must use each other to survive. However, as time passes while they are together, hatred and obsession transform into an inexplicable attraction. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | PASS | 33 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../chapter-16` at offsets 15, 16 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.lustoon.com/.../0.00.jpg` (image/jpeg, 1639231 bytes, 2400x1600) |  |  |  |
