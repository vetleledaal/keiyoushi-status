# Extension Validation Report

- Extension: tachiyomi-all.ahrigallery-v1.6.1
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
- Source implementation: keiyoushi.source.j
- Source ID: 4258304358617590905
- Source name: Ahri Gallery
- Source language: en
- Selected manga input: popular offset 0: [Fanbox] 加瀬大輝 [2023/07/31 - 2026/04/24] (`.../index.php <redacted query values: route, comic_id, and c_id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | [Fanbox] 加瀬大輝 [2023/07/31 - 2026/04/24] (`.../index.php <redacted query values: route, comic_id, and c_id>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 100 | [WaterRing] 2023/03-2024/02 Patreon reward (`.../index.php <redacted query values: route, comic_id, and c_id>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 100 | [山本直樹] 堀田 4 [10-09-01] (`.../index.php <redacted query values: route, comic_id, and c_id>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | [煌野一人] 変態metamorphosis -JK退魔部fragment- [英訳] (`.../index.php <redacted query values: route, comic_id, and c_id>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | [Fanbox] 加瀬大輝 [2023/07/31 - 2026/04/24] (`.../index.php <redacted query values: route, comic_id, and c_id>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Fanbox] 加瀬大輝 [2023/07/31 - 2026/04/24] (`.../index.php <redacted query values: route, comic_id, and c_id>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../index.php <redacted query values: route, comic_id, and c_id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1833 |  |  | <1s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Fanbox\] 加瀬大輝 \[2023/07/31 - 2026/04/24\], URL=`.../index.php <redacted query values: route, comic_id, and c_id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 402/402 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 402/402 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c2.imkhan2026-04-27.top/.../3915322.avif` (image/avif (format: avif), 75643 bytes, 800x1123; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../index.php <redacted query values: route, comic_id, and c_id>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://c2.imkhan2026-04-27.top/.../3915322.avif` was not downloaded |  |  |  |
| details author | PASS | kase daiki |  |  |  |
| details artist | PASS | kase daiki |  |  |  |
| details genres | PASS | Image Set, school swimsuit, facesitting, bikini, school gym uniform, fishnets, ponytail, tanlines, stockings, maid, cunnilingus, nun, thigh high boots, oyakodon, big ass, sex toys, kimono, double penetration, yuri, shimaidon, sweating, swimsuit, transparent clothing, sleeping, apparel bukkake, cosplaying, hairy, high heels, footjob, big breasts, pasties, nakadashi, urination, exhibitionism, policewoman, bunny girl, gymshorts, schoolgirl uniform, latex, chikan, chinese dress, handjob, vaginal sticker, lingerie, garter belt, exposed clothing, cousin, sister, anal, wet clothes, pantyhose, teacher, incest, group, ffm threesome, mosaic censorship |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★★ 10 (1638)<br>English · 1833 pages · **Favorites:** 37700 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1833 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://a3-2.imghentai2026-09-16.top/.../1.avif` (image/avif (format: avif), 89657 bytes, 1069x1500; server Content-Type: application/octet-stream) |  |  |  |
