# Extension Validation Report

- Extension: tachiyomi-all.fourkhd-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 1
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6501663152246384585
- Source name: 4KHD
- Source language: all
- Selected manga input: popular offset 0: Bomi (보미) – [Bimilstory] Vol.53 sailor girl[297MB-82photos] (`.../bomi-bimilstory-vol53-sailor-girl.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Bomi (보미) – [Bimilstory] Vol.53 sailor girl[297MB-82photos] (`.../bomi-bimilstory-vol53-sailor-girl.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 白露很白 – 飞鸟马时[6MB-40photos] (`.../the-white-dew-is-very-white-asuka-and-horse-time.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | X-Level Miyu (미유리) – Black Cat[333MB-117photos] (`.../xlevel-miyu-black-cat.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | chuchu – Fate stay night性杯戦争[2.85GB-378photos] (`.../chuchu-fate-stay-night-sex-cup-war.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bomi (보미) – [Bimilstory] Vol.53 sailor girl[297MB-82photos] (`.../bomi-bimilstory-vol53-sailor-girl.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../bomi-bimilstory-vol53-sailor-girl.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 82 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 502 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../4KHD-beautifulGirls.webp` (image/jpeg, 173843 bytes, 1090x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bomi-bimilstory-vol53-sailor-girl.html` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../4KHD-beautifulGirls.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | photo |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i0.wp.com/.../ailor-girl-4khd.com-001.webp <redacted query values: w>` (image/webp (container: extended), 99244 bytes, 1300x1731) |  |  |  |
