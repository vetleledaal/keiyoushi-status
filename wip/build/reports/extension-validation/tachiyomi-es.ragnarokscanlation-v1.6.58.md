# Extension Validation Report

- Extension: tachiyomi-es.ragnarokscanlation-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1348827658894665970
- Source name: Ragnarok Scanlation
- Source language: es
- Selected manga input: popular offset 0: Blue Lock (`.../2228`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Blue Lock (`.../2228`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 14 | Nigromante en solitario (`.../2726`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Mokushiroku no Yonkishi (`.../2984`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 14 | Marchen Crown (`.../2377`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Blue Lock (`.../2228`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`.../2228`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 75 | Chapter 265 (`.../chapter-265`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`2228` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 79/79 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 79/79 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://ragnarokscanlation.org/.../91twKXjyEyL._SL1500_-350x476.png` -> 2 manga URLs (examples: `1880`, `2445`), `https://ragnarokscanlation.org/.../MNY-350x476.webp` -> 2 manga URLs (examples: `3796`, `2984`) |  |  |  |
| thumbnail | PASS | `https://ragnarokscanlation.org/.../e1f73f40-5e0c-4b38-8856-174b14a7b524-350x476.jpg` (image/jpeg, 46490 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2228` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ragnarokscanlation.org/.../e1f73f40-5e0c-4b38-8856-174b14a7b524-scaled.jpg` (image/jpeg, 512032 bytes, 1711x2560) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoichi Isagi lost the opportunity to go to the national high school championships because he passed to his teammate who missed instead of shooting himself. Isagi is one of 300 U-18 strikers chosen by Jinpachi Ego, a man who was hired by the Japan Football Association after the 2018 FIFA World Cup, to guide Japan to winning the World Cup by destroying Japanese football. Ego’s plan is to isolate the 300 strikers into a prison-like institution called “Blue Lock”, in order to create the world’s biggest “egotist”.../striker, which has been lacking in Japanese football.<br><br>Nombres Alternativos: B. Lock |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 75 chapters |  |  |  |
| chapter dates | PASS | 75 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ragnarokscanlation.org/.../IMG_0511.jpeg` (image/jpeg, 464110 bytes, 958x1373) |  |  |  |
