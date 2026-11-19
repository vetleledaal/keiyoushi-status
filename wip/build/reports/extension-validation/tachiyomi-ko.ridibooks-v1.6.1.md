# Extension Validation Report

- Extension: tachiyomi-ko.ridibooks-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5486336157341144793
- Source name: RidiBooks
- Source language: ko
- Selected manga input: popular offset 0: 오월의 정원에서 [외전] (`.../6253000035`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | 오월의 정원에서 [외전] (`.../6253000035`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | 개같은 아저씨 (`.../3776003617`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | 영웅은 몸으로 구원한다 (`.../3092046949`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | 그대 나를 잊으소서[완전판] (`.../6156000058`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 오월의 정원에서 [외전] (`.../6253000035`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 오월의 정원에서 [외전] (`.../6253000035`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 🔒 1화 (`.../6253000035`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView to read this chapter | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView to read this chapter | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=오월의 정원에서 \[외전\], URL=`6253000035` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 243/243 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 243/243 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.ridicdn.net/.../xxlarge` (image/jpeg, 42274 bytes, 480x696) |  |  |  |
| details identity | PASS | Details preserved selected URL `6253000035` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.ridicdn.net/.../xxlarge` (image/jpeg, 42274 bytes, 480x696) |  |  |  |
| details author | PASS | 스르륵코믹스, 서담연 |  |  |  |
| details artist | PASS | 스르륵코믹스 |  |  |  |
| details genres | PASS | 성인, 로판 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \<strong>\*본 작품은 웹툰 &lt;오월의 정원에서&gt;의 외전입니다.\<.../strong%3E<br><br>“여름이잖아. 고작해야 한 철이면 다 져 버릴.”<br>\-<br>“신께 맹세코, 죽어도 내가 먼저 사랑한다고 말할 일은 없을 거야.”<br><br>부모님의 죽음 이후 바네사를 기다리고 있는 것은<br>막대한 빚과 원치 않는 결혼이었다.<br><br>혼약을 어그러트리기 위해서는 추문이 필요했고,<br>마침 그녀 앞에 나타난 '정원사' 시어도어는 너무나 완벽한 상대였을 뿐이다.<br><br>그저 그뿐이었다. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView to read this chapter |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
