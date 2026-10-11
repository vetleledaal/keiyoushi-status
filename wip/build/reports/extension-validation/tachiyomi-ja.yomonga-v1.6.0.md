# Extension Validation Report

- Extension: tachiyomi-ja.yomonga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7561635982432447429
- Source name: Yomonga
- Source language: ja
- Selected manga input: popular offset 0: この家族、壊れてる。～“選ばれなかった妻”の地獄～ (`.../2569 <redacted query values: episode and cid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | この家族、壊れてる。～“選ばれなかった妻”の地獄～ (`.../2569 <redacted query values: episode and cid>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | 黒天の魔王～魔物の言葉がわかる俺、虐げられた魔物たちの救世主となり最強国家を作り上げる～ (`.../2303 <redacted query values: episode and cid>`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | この家族、壊れてる。～“選ばれなかった妻”の地獄～ (`.../2569 <redacted query values: episode and cid>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | この家族、壊れてる。～“選ばれなかった妻”の地獄～ (`.../2569 <redacted query values: episode and cid>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Chapter.１_1巻 第１話-１ (`.../10759`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=この家族、壊れてる。～“選ばれなかった妻”の地獄～, URL=`.../2569 <redacted query values: episode and cid>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.yomonga.com/.../%E6%9B%B8%E5%BD%B1%E3%82%B5%E3%83%A0%E3%83%8D%E3%82%A4%E3%83%AB_%E6%96%B0%E5%88%8A_%E3%81%93%E3%81%AE%E5%AE%B6%E6%97%8F%E3%80%81%E5%A3%8A%E3%82%8C%E3%81%A6%E3%82%8B%E3%80%82.png <redacted query values: v>` (image/png, 300633 bytes, 640x908) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2569 <redacted query values: episode and cid>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.yomonga.com/.../%E6%9B%B8%E5%BD%B1%E3%82%B5%E3%83%A0%E3%83%8D%E3%82%A4%E3%83%AB_%E6%96%B0%E5%88%8A_%E3%81%93%E3%81%AE%E5%AE%B6%E6%97%8F%E3%80%81%E5%A3%8A%E3%82%8C%E3%81%A6%E3%82%8B%E3%80%82.png` (image/png, 300633 bytes, 640x908) |  |  |  |
| details author | PASS | 百田ちなこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 連載中, 女性向け |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 36歳の片岡夏希は、3歳年下の夫・清正と東京都内で穏やかな日々を送っている。 子どもを望まない清正との生活は穏やかで、幸せな結婚生活を築いてきた。 孫を切望する義母との確執を除いては──…。 義実家に帰省する度に冷たい視線と、遠回しな嫌味を言われる夏希は、「帰省のときだけだから──」と笑顔を保ち耐えていた。 ところが、今回の帰省では義妹・愛香が不思議なほど夏希に優しく接してきたことで、夏希は愛香と打ち解けるようになる。 愛香のその笑顔の奥にある意図を、夏希はまだ知らずに──。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.yomonga.com/.../JLeKANU_.jpg` (image/jpeg, 1001346 bytes, 1624x2305) |  |  |  |
