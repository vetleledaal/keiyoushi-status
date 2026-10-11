# Extension Validation Report

- Extension: tachiyomi-en.ebookrenta-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 8412178155364465470
- Source name: EbookRenta
- Source language: en
- Selected manga input: popular offset 0: I Could Just Eat You Up My Lil' Cutie -A Bad Boy's Relentless Infatuation- (`.../144052`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | I Could Just Eat You Up My Lil' Cutie -A Bad Boy's Relentless Infatuation- (`.../144052`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | All I Think About Is... (With Special Bonus Comic) (`.../155857`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Wholehearted Love From the Go-Getter Gyaru (`.../155839`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Bride of the War God (`.../155642`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Could Just Eat You Up My Lil' Cutie -A Bad Boy's Relentless Infatuation- (`.../144052`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Could Just Eat You Up My Lil' Cutie -A Bad Boy's Relentless Infatuation- (`.../144052`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | 🔒 (Preview) I Could Just Eat You Up My Lil' Cutie -A Bad Boy's Relentless Infatuation- (1) (`.../2122738`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Could Just Eat You Up My Lil' Cutie -A Bad Boy's Relentless Infatuation-, URL=`144052` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.ebookrenta.com/.../9-2122738-c400.jpg` (image/jpeg, 36822 bytes, 283x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `144052` |  |  |  |
| details thumbnail URL | PASS | `https://img.ebookrenta.com/.../9-2122738-c400.jpg` |  |  |  |
| details author | PASS | Tokiko Nakura |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Mature Romance Manga, Delinquents, College, Localized by Renta, Upgrade, Hot, by chapter |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ryuji asks Mayu out, but it's really more of a threat. Shy, bookish Mayu can't escape from bad boy Ryuji because not only do they go to university together, but they work at the same café, too. She knows he only asked her out on a dare, so she just has to bide her time until this whole nightmare is over. But what if she doesn't want it to end? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.ebookrenta.com/.../viewer <redacted query values: type, prd_tid, and style>` to `https://www.ebookrenta.com/.../smpl.cgi <redacted query values: type, prd_tid, and style>` (1 redirects); popular: `https://en-dcs.ebookrenta.com/.../smpl.cgi <redacted query values: cmp, prd_id, and br_id>` to `https://renta-viewer.ebookrenta.com/.../index.view` (2 redirects) |  |  |  |
| page load | PASS | `https://en-dre-aws3-fs.ebookrenta.com/.../1 <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 266078 bytes, 850x1200; server Content-Type: application/octet-stream) |  |  |  |
