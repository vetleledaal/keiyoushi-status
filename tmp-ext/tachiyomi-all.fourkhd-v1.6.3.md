# Extension Validation Report

- Extension: tachiyomi-all.fourkhd-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 0
- Warnings: 1
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
- Selected manga input: popular offset 0: MiM Tịt – Blanc (Fortune Express)[3MB-14photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-mim-t-e1-bb-8bt-blanc-fortune-express-ie-utf.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | MiM Tịt – Blanc (Fortune Express)[3MB-14photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-mim-t-e1-bb-8bt-blanc-fortune-express-ie-utf.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 泗水的脑袋尖尖的 金色巫女[807MB-61photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-e6-b3-97-e6-b0-b4-e7-9a-84-e8-84-91-e8-a2-3.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Yeha (예하) Slime Toy[3.62GB-83photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-yeha-ec-98-88-ed-95-98-slime-toy-ie-utf-8-oe.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 九言 绝区零 简杜[401MB-30photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-e4-b9-9d-e8-a8-80-e7-bb-9d-e5-8c-ba-e9-9b-b6.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | MiM Tịt – Blanc (Fortune Express)[3MB-14photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-mim-t-e1-bb-8bt-blanc-fortune-express-ie-utf.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-mim-t-e1-bb-8bt-blanc-fortune-express-ie-utf.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 10s+ |

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
| thumbnail | PASS | `https://img.4khd.com/.../4KHD-beautifulGirls.webp` (image/jpeg, 181468 bytes, 1090x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-mim-t-e1-bb-8bt-blanc-fortune-express-ie-utf.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.4khd.com/.../4KHD-beautifulGirls.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | cosplay |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img.uuss.uk/.../-truncated-4khd.com-001.webp <redacted query values: w>` to `https://i0.wp.com/.../-truncated-4khd.com-001.webp` (1 redirects); popular: `https://img.4khd.com/.../4KHD-beautifulGirls.webp` to `https://i0.wp.com/.../4KHD-beautifulGirls.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://img.uuss.uk/.../-truncated-4khd.com-001.webp <redacted query values: w>` (image/jpeg, 386564 bytes, 1350x1350) |  |  |  |
