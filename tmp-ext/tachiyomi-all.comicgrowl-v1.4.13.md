# Extension Validation Report

- Extension: tachiyomi-all.comicgrowl-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 299423548273637501
- Source name: Comic Growl
- Source language: all
- Selected manga input: popular offset 0: 忠誠心がないと言われたので婚約を解消してあげました。 (`.../1f3f7d6efdeff`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 忠誠心がないと言われたので婚約を解消してあげました。 (`.../1f3f7d6efdeff`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 11 | なんでもメイドと侯爵様の子育て論 (`.../0b0596ac01887`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 忠誠心がないと言われたので婚約を解消してあげました。 (`.../1f3f7d6efdeff`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 忠誠心がないと言われたので婚約を解消してあげました。 (`.../1f3f7d6efdeff`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 42 | 1 (`.../9822025b58ae6`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 67 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=忠誠心がないと言われたので婚約を解消してあげました。, URL=`.../1f3f7d6efdeff` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 44/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250217121203347EAB16E0C2F7D09F2ECDE9E58748A0B97-lg.webp` (image/webp (encoding: lossy), 30814 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1f3f7d6efdeff` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250217121203347EAB16E0C2F7D09F2ECDE9E58748A0B97.png` (image/png, 3663806 bytes, 2560x1344) |  |  |  |
| details author | PASS | ササキサキ, さこの, ウラシマ |  |  |  |
| details artist | PASS | ササキサキ, さこの, ウラシマ |  |  |  |
| details genres | PASS | コミカライズ, 令嬢・宮廷, 恋愛, アーデレル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 子爵令嬢ルビナが、ある日婚約者と街歩きしていると、別の女性との会話に夢中になった婚約者に置いてけぼりにされてしまう……。困惑する彼女に、謎の紳士・ジェイが声をかけてきて――。<br>【更新予定】第20話-①：9/2(水)｜第20話-②：9/16(水)｜第21話-①：10/7(水) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.comic-growl.com/.../master-1739343801792-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 10, 7, 3, 15, 13, 9, 8, 5, 14, 2, 12, 1, 0, 6, 11\]` (image/jpeg, 460554 bytes, 1363x1920) |  |  |  |
