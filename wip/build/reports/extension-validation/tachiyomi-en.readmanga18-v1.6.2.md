# Extension Validation Report

- Extension: tachiyomi-en.readmanga18-v1.6.2
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
- Source theme: yiimadara
- Source ID: 8341261297497729714
- Source name: ReadManga18
- Source language: en
- Selected manga input: popular offset 0: The Hole is Open (`.../the-hole-is-open`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | The Hole is Open (`.../the-hole-is-open`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 13 | My High School Bully (`.../my-high-school-bully`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | My Exclusive Tower Guide (`.../my-exclusive-tower-guide`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 13 | I’m the Only Man on the Military Base (`.../im-the-only-man-on-the-military-base`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Hole is Open (`.../the-hole-is-open`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Hole is Open (`.../the-hole-is-open`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 161 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 64 |  |  | <1s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Hole is Open, URL=`.../the-hole-is-open` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://readmanga18.com/.../the-hole-is-open-cover.jpg` (image/jpeg, 13695 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-hole-is-open` |  |  |  |
| details thumbnail URL | PASS | `https://readmanga18.com/.../the-hole-is-open-cover.jpg` |  |  |  |
| details author | PASS | Kimtuk |  |  |  |
| details artist | PASS | DDOT |  |  |  |
| details genres | PASS | Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | JA-KANG inherited his grandfather’s store. In the secret room, there is a secret “hole” ?!<br><br>Alternative names: The Hole is Open / The Shop of Pleasure / Glory Hole Shop / 洞洞雜貨店 / 구멍가게, 구멍 열었습니다 / La Tienda del Placer / Tienda de agujeros |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 161 chapters |  |  |  |
| chapter dates | PASS | 161 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img22.readmanga18.com/.../1-54596.jpg` (image/jpeg, 111243 bytes, 720x2500) |  |  |  |
