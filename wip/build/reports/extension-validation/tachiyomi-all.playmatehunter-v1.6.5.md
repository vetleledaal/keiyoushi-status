# Extension Validation Report

- Extension: tachiyomi-all.playmatehunter-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: masonry
- Source ID: 1082062847119890629
- Source name: Playmate Hunter
- Source language: all
- Selected manga input: popular offset 0: Last Stop (`.../juniper-hope-in-last-stop`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Last Stop (`.../juniper-hope-in-last-stop`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Lindsey Vuolo (`.../lindsey-vuolo-nude`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Riley Anne in Veiled Allure from Playboy (`.../riley-anne-in-veiled-allure`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Roxy Shaw in Private Show from Playboy (`.../roxy-shaw-in-private-show`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Last Stop (`.../juniper-hope-in-last-stop`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Last Stop (`.../juniper-hope-in-last-stop`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../juniper-hope-in-last-stop`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Last Stop, URL=`.../juniper-hope-in-last-stop` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.pmatehunter.com/.../2982004_masonry_1200.jpg` (image/jpeg, 354926 bytes, 1200x1799) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../juniper-hope-in-last-stop` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Juniper Hope |  |  |  |
| details artist | PASS | Juniper Hope, Model |  |  |  |
| details genres | PASS | Big Tits, Blonde, High Heels, Latex, Lingerie, Milf, Stockings, Big Natural Tits, Centerfold, Model, Perfect Body, Perfect Tits, Posing |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | \[Juniper Hope\](https://pmatehunter.com/.../juniper-hope)\[Big Tits\](https://pmatehunter.com/.../big-tits) \[Blonde\](https://pmatehunter.com/.../blonde) \[High Heels\](https://pmatehunter.com/.../high-heels) \[Latex\](https://pmatehunter.com/.../latex) \[Lingerie\](https://pmatehunter.com/.../lingerie) \[Milf\](https://pmatehunter.com/.../milf) \[Stockings\](https://pmatehunter.com/.../stockings) \[Big Natural Tits\](https://pmatehunter.com/.../big-natural-tits) \[Centerfold\](https://pmatehunter.com/.../centerfold) \[Model\](https://pmatehunter.com/.../model) \[Perfect Body\](https://pmatehunter.com/.../perfect-body) \[Perfect Tits\](https://pmatehunter.com/.../perfect-tits) \[Posing\](https://pmatehunter.com/.../posing) \[\+ All Tags\](https://pmatehunter.com/.../juniper-hope-in-last-stop)\[\- Less Tags\](https://pmatehunter.com/.../juniper-hope-in-last-stop) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.pmatehunter.com/.../0002-01_1800.jpg` (image/jpeg, 339250 bytes, 1800x1201) |  |  |  |
