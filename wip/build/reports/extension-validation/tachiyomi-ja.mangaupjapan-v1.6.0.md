# Extension Validation Report

- Extension: tachiyomi-ja.mangaupjapan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 697820552173578283
- Source name: Manga UP! (Japan)
- Source language: ja
- Selected manga input: popular offset 0: あなたのお城の小人さん　～御飯下さい、働きますっ～ (`.../1302`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | あなたのお城の小人さん　～御飯下さい、働きますっ～ (`.../1302`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 62 | 異世界賢者の転生無双　～ゲームの知識で異世界最強～ (`.../522`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | あなたのお城の小人さん　～御飯下さい、働きますっ～ (`.../1302`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | あなたのお城の小人さん　～御飯下さい、働きますっ～ (`.../1302`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | 第1話 - 厨房の小人さん (`.../269482`) |  | <1s |
| pages | `getPageList(chapter)` | success | 96 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 62 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=あなたのお城の小人さん　～御飯下さい、働きますっ～, URL=`.../1302` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 113/113 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 113/113 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ja-img.manga-up.com/.../1302.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 35468 bytes, 640x442) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1302` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ja-img.manga-up.com/.../1302.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 119868 bytes, 1242x828) |  |  |  |
| details author | PASS | 原作：美袋和仁, 原作イラスト：п猫Ｒ, 漫画：栗原一実 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性, ファンタジー・幻想, ヒューマンドラマ, 転生・転移, 王族・貴族, ファンタジー・幻想 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「……おなか……すいた」 大きなお城の片隅で、小さな子供が力尽きようとしていた。飢えと渇きによって命が尽きかけた瞬間、その意識の中で眼を覚ましたのは……元日本人OLの相模千尋（さがみ ちひろ）。 ……死んでたまるかっ! 水を、食べ物を探してお城をさまよう千尋は、やがて優しい料理人と出会う。 「御飯下さい！ 働きますっ！」 小さい体で一生懸命、お城の厨房を走り回る彼女に、ついたあだ名は「小人さん」！ 多くの愛を受け、美味しい食べ物を求めて、今日も元気に城の中、森を、世界を爆走する小人さん…… だけど、彼女の金色の瞳には、世界の未来を左右する大きな秘密があった！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | LINT | All 83 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=83 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 96 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ja-img.manga-up.com/.../1963d7460_1_001.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 71196 bytes, 1080x1536) |  |  |  |
