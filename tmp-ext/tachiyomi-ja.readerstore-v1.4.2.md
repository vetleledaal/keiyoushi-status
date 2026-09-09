# Extension Validation Report

- Extension: tachiyomi-ja.readerstore-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 424606783143704524
- Source name: Reader Store
- Source language: ja
- Selected manga input: latest offset 0: 週刊少年サンデー (`.../10239629`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | ダンダダン (`.../10597894`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | 実は俺、最強でした？ (`.../00660391`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | 週刊少年サンデー (`.../10239629`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | 1週間でClaude Codeの基礎が学べる本 (`.../11547389`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 50 | 週刊少年サンデー (`.../10239629`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 週刊少年サンデー (`.../10239629`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 25 | 🔒 (Preview) 週刊少年サンデー　２０２６年１５号（２０２６年３月１１日発売号）【デジタル版限定グラビア増量「Ｊｕｉｃｅ＝Ｊｕｉｃｅ」】 (`.../LT000237250003956844`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=週刊少年サンデー, URL=`10239629` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ebookstore.sony.jp/.../LT000246947004410382_XLARGE.jpg` (image/jpeg, 66886 bytes, 348x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `10239629` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ebookstore.sony.jp/.../LT000237250003956844_XLARGE.jpg` (image/jpeg, 48645 bytes, 348x500) |  |  |  |
| details author | PASS | 週刊少年サンデー編集部 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | コミック, コミック誌, 男性コミック誌 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | スポーツも、美少女も、熱いバトルも！！ 毎週水曜日を楽しくする漫画雑誌 「週刊少年サンデー」電子版！ ※電子版に関しましては、目次の情報と一部内容が異なる場合があります。 付録も含まれません。また広告・価格表示などは全て発行した当時の情報となります。 ※電子版につきましては、本誌内の一部のプレゼントへの応募、および応募者全員サービスへの応募は出来ません。 何卒ご了承ください。<br><br>Magazine: 少年サンデー<br><br>Publisher: 小学館 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | PASS | 25 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.ebookstore.sony.jp/.../image_url <redacted query values: indices, code, and accept>` (image/webp (encoding: lossy), 458792 bytes, 891x1280) |  |  |  |
