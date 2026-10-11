# Extension Validation Report

- Extension: tachiyomi-en.yaoihot-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 23
- Lint: 2
- Warnings: 2
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2792939609625225108
- Source name: YaoiHot
- Source language: en
- Selected manga input: popular offset 0: Dirty Vibration (`.../dirty-vibration`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Dirty Vibration (`.../dirty-vibration`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | The Hounds Of Sisyphus Official Uncensored (`.../the-hounds-of-sisyphus-official-uncensored`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Dirty Vibration (`.../dirty-vibration`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | The Hounds Of Sisyphus Official Uncensored (`.../the-hounds-of-sisyphus-official-uncensored`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dirty Vibration (`.../dirty-vibration`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dirty Vibration (`.../dirty-vibration`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dirty Vibration, URL=`.../dirty-vibration` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoihot.com/.../dirty-vibration-200x300.webp` (image/webp (encoding: lossy), 17706 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dirty-vibration` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yaoihot.com/.../dirty-vibration.webp` (image/webp (encoding: lossy), 111892 bytes, 400x600) |  |  |  |
| details author | PASS | Fujoking |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL, Explicit Sex, Full Color, Manhwa, Smut, Webtoons, Yaoi |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Dirty ♥ Vibration Best friends Yeong and Nohae thought it was a joke when they downloaded the infamous “cursed” app. It’s said to command the user to perform… sexual acts and punishes those who disobey or delete it. It started with making them kiss. When they disobeyed its order… the punishment was anything but a joke. Yeong is just a mild-mannered twenty something. Nohae is an award-winning male model, superstar, and now, thanks to the app, sexual deviant. Can they survive the app’s dirty commands? Or will it continue to shame them or even worse… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://yaoihot.com/.../manga <redacted query values: orderby>` to `https://yaoihot.com/.../manga <redacted query values: orderby>` (1 redirects); popular: `https://yaoihot.com/.../manga <redacted query values: orderby>` to `https://yaoihot.com/.../manga <redacted query values: orderby>` (1 redirects); popular: `https://yaoihot.com/.../2 <redacted query values: orderby>` to `https://yaoihot.com/.../2 <redacted query values: orderby>` (1 redirects); popular: `https://yaoihot.com/.../2 <redacted query values: orderby>` to `https://yaoihot.com/.../2 <redacted query values: orderby>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
