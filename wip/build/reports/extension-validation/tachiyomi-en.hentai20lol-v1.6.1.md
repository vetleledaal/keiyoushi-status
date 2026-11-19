# Extension Validation Report

- Extension: tachiyomi-en.hentai20lol-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 3598862142817438721
- Source name: Hentai20 (Unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../stop-smoking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | I’ll Eat Your Mom First (`.../ill-eat-your-mom-first`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Kim's Shop Raw (`.../kims-shop-raw`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Stop Smoking Raw (`.../stop+-smoking-raw`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 121 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Stop Smoking, URL=`.../stop-smoking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai20.lol/.../stop-smoking-cover.jpg` (image/jpeg, 14587 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stop-smoking` |  |  |  |
| details thumbnail URL | PASS | `https://hentai20.lol/.../stop-smoking-cover.jpg` |  |  |  |
| details author | PASS | AA |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Comedy, Drama, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Even though I get teased for being short and bullied at work, my house is paradise!!<br><br>... I thought it was like that, but the neighbors are smoking like crazy!!<br><br>I couldn't stand it anymore and went to look for them, but I met a fierce-looking, heavy-duty gangster, Na Se-young!<br><br>Alternative names: 담배피지 마세요! / Someone Stop Her! / Deja de fumar |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 121 chapters |  |  |  |
| chapter dates | PASS | 121 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img01.hentai20.lol/.../1-d2d.jpg` (image/jpeg, 57014 bytes, 720x759) |  |  |  |
