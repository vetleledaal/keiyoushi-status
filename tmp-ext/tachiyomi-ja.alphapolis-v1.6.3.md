# Extension Validation Report

- Extension: tachiyomi-ja.alphapolis-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1943011614685426671
- Source name: Alphapolis
- Source language: ja
- Selected manga input: popular offset 0: 側妃のお仕事は終了です。 (`.../11000708`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 側妃のお仕事は終了です。 (`.../11000708`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | 引退した嫌われＳ級冒険者はスローラ... (`.../81000759`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 48 | ほっといて下さい　―従魔とチートライ... (`.../552000379`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 側妃のお仕事は終了です。 (`.../11000708`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 側妃のお仕事は終了です。 (`.../11000708`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | 第1回 (`.../10880`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=側妃のお仕事は終了です。, URL=`.../11000708` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` (image/webp (encoding: lossy), 82950 bytes, 670x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../11000708` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` |  |  |  |
| details author | PASS | 火野村志紀 |  |  |  |
| details artist | PASS | とぐろなす |  |  |  |
| details genres | PASS | 異世界, ファンタジー, ざまぁ, 側妃, 悪女 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 婚約者のサディアス王太子から側妃になれと告げられた侯爵令嬢・アニュエラ。どうやら彼の隣に立つ美少女、公爵令嬢・ミリアを正妻にするらしい。この国で側妃とは、いわば愛人。絶望と怒りに震えながらも、アニュエラはなすすべなくその地位を受け入れる。だが、側妃として侮辱される日々が始まり、地位も名誉も尊厳も全てを失った時、アニュエラの中で何かがプツンと切れる。……側妃でいる義理などないわ。そこから自分らしく生きることを決意して……!?　冷遇された側妃の超爽快・快進撃が今始まる――！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | LINT | 5 of 8 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ot-image.alphapolis.co.jp/.../1080x1536.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 792622 bytes, 1080x1536) |  |  |  |
