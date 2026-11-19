# Extension Validation Report

- Extension: tachiyomi-vi.hentaicube-v1.6.101
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 823638192569572166
- Source name: CBHentai
- Source language: vi
- Selected manga input: popular offset 0: Lỗ đã mở (`.../31556`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Lỗ đã mở (`.../31556`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Dear My Mother (`.../2028`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Himejima senpai cực kì tò mò về tình dục (`.../51023`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Furete Tokashite Afuresasete (`.../50926`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Lỗ đã mở (`.../31556`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lỗ đã mở (`.../31556`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 152 | Chap 01 (`.../chap-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lỗ đã mở, URL=`31556` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://2tencb.pro/.../truyen-lo-da-mo.jpg` (image/jpeg, 27685 bytes, 282x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `31556` |  |  |  |
| details thumbnail URL | PASS | `https://2tencb.pro/.../truyen-lo-da-mo.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | 2TENCB |  |  |  |
| details genres | PASS | 2tencb, anal, aunt, big ass, big breasts, cheating, cunnilingus, defloration, drunk, full color, group, harem, housewife, incest, lingerie, masturbation, milf, office lady, outdoor, paizuri, pregnant, sex toys, stockings, teacher, virginity, webtoon, widow |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | JA-KANG được thừa kế cửa hàng của ông nội. Trong căn phòng bí mật, có một “lỗ hổng” bí ẩn?! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 152 chapters |  |  |  |
| chapter dates | PASS | 152 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Captcha needs interaction, but the app isn't in the foreground |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
