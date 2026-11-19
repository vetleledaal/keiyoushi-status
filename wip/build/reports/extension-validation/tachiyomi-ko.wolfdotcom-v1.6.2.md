# Extension Validation Report

- Extension: tachiyomi-ko.wolfdotcom-v1.6.2
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
- Source implementation: keiyoushi.source.d
- Source ID: 5583626852311652499
- Source name: 늑대닷컴 - 웹툰
- Source language: ko
- Selected manga input: popular offset 0: 무선 연결 오나홀 (`.../72442`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 무선 연결 오나홀 (`.../72442`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | 남자가희귀함 (`.../74174`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | 몽홀 (`.../258`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 상남자(네이버) (`.../5418`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 무선 연결 오나홀 (`.../72442`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 무선 연결 오나홀 (`.../72442`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 129 | 무선 연결 오나홀 1화 (`.../%7B%22toon%22:%2272442%22,%22num%22:%221%22%7D`) |  | <1s |
| pages | `getPageList(chapter)` | success | 69 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=무선 연결 오나홀, URL=`72442` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://y17stm.com/.../qn8dok2lpdwlogtzq21t27nhubpzoo8cdp_0.jpg` (image/jpeg, 25037 bytes, 300x153) |  |  |  |
| details identity | PASS | Details preserved selected URL `72442` |  |  |  |
| details thumbnail URL | PASS | `https://y17stm.com/.../qn8dok2lpdwlogtzq21t27nhubpzoo8cdp_0.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 성인 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “오나홀이… 움직였어?!”우연히 주변 여자와 연동되는 오나홀을 사버린 공대생 박우진. 일단 우리 학과 최고 여신 아영이부터...? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 129 chapters |  |  |  |
| chapter dates | PASS | 129 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 69 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://y17stm.com/.../sllnd4he6a2pjo9py59nupmzwi6zfywpx1_0.jpg` (image/jpeg, 166910 bytes, 690x2585) |  |  |  |
