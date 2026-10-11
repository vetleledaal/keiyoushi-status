# Extension Validation Report

- Extension: tachiyomi-en.emaqi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3383118804501081522
- Source name: emaqi
- Source language: en
- Selected manga input: popular offset 0: Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | The Soldier Groom and the Daikon Bride (`.../1e101166-91e5-4e14-b544-3b5b8ac18305`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Anjo the Mischievous Gal (`.../6763d1bb-0d5e-4c6d-a634-a82db649c0c1`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 135 | 🔒 (Preview) Vol. 1 (`.../9798894950051`) |  | <1s |
| pages | `getPageList(chapter)` | success | 87 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Anjo the Mischievous Gal, URL=`6763d1bb-0d5e-4c6d-a634-a82db649c0c1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 26/26 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 26/26 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://r.emaqi.com/.../877765a7-407c-4cd0-a1bf-642ac1edeba4.jpg` (image/png, 1190811 bytes, 853x1200; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `6763d1bb-0d5e-4c6d-a634-a82db649c0c1` |  |  |  |
| details thumbnail URL | PASS | `https://r.emaqi.com/.../877765a7-407c-4cd0-a1bf-642ac1edeba4.jpg` |  |  |  |
| details author | PASS | Yuichi Kato |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Rom-Com, School / Academy, Heart-fluttering, Funny, Healing, Only on emaqi, As Seen in Ads, Awards & Nominations, Ongoing Series, 2010s |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seto, a studious but unremarkable student, constantly finds himself in provocative situations with Anjo, the popular girl in his class who can't seem to stop teasing him. A heart-pounding teen rom-com bursting with youthful passion!<br><br>Publisher: SHONENGAHOSHA CO., LTD.<br><br>Age limit: 16+ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 135 chapters |  |  |  |
| chapter dates | PASS | 135 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 87 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pr.emaqi.com/.../4739a585-d487-4983-9eb6-5c0b71bbf1e9 <redacted query values: Expires, KeyName, and Signature>` (image/jpeg, 6499 bytes, 853x1200; server Content-Type: application/octet-stream) |  |  |  |
