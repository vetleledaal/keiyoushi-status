# Extension Validation Report

- Extension: tachiyomi-all.fourkhd-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
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
- Selected manga input: latest offset 0: Yeha (예하) School Nurse[385MB-126photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-yeha-ec-98-88-ed-95-98-school-nurse-ie-utf-8.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Bomi (보미) girl crush[606MB-18photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-bomi-eb-b3-b4-eb-af-b8-girl-crush-ie-utf-8-o.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 御子Yumiko 普拉娜万圣节[231MB-75photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-e5-be-a1-e5-ad-90yumiko-e6-99-ae-e6-8b-89-e5.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Yeha (예하) School Nurse[385MB-126photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-yeha-ec-98-88-ed-95-98-school-nurse-ie-utf-8.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [JP] Hikaru Aoyama (青山ひかる) – 「純度100％」(週プレ PHOTO BOOK)[34MB-100photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-jp-hikaru-aoyama-e9-9d-92-e5-b1-b1-e3-81-b-2.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yeha (예하) School Nurse[385MB-126photos] (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-yeha-ec-98-88-ed-95-98-school-nurse-ie-utf-8.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-yeha-ec-98-88-ed-95-98-school-nurse-ie-utf-8.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 126 |  |  | 1-10s |

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
| thumbnail | PASS | `https://img.4khd.com/.../4KHD-beautifulGirls.webp` (image/jpeg, 131081 bytes, 1090x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../client-error-get-https-translate-google-com-translate-a-single-client-gtx-hl-en-dt-t-dt-bd-dt-at-dt-ex-dt-ld-dt-md-dt-qca-dt-rw-dt-rm-dt-ss-sl-auto-tl-en-q-yeha-ec-98-88-ed-95-98-school-nurse-ie-utf-8.html` |  |  |  |
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
| page URLs | PASS | 126 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.uuss.uk/.../-truncated-4khd.com-001.webp <redacted query values: w>` (image/jpeg, 227245 bytes, 1350x2025) |  |  |  |
