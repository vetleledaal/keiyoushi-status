# Extension Validation Report

- Extension: tachiyomi-ja.mangaboxme-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1624494110013319952
- Source name: MangaBox
- Source language: ja
- Selected manga input: popular offset 0: 元風俗嬢が金持ち妻になりました (`.../59579`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 4 | 元風俗嬢が金持ち妻になりました (`.../59579`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 5 | 高良くんと天城くんRe (`.../626611`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 元風俗嬢が金持ち妻になりました (`.../59579`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 元風俗嬢が金持ち妻になりました (`.../59579`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 219 | 第1話 (`.../26987`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=元風俗嬢が金持ち妻になりました, URL=`59579` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 10/10 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 10/10 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image-c.cdn.mangabox.me/.../manga_episode_grid_59579.png` (image/png, 116180 bytes, 744x792) |  |  |  |
| details identity | PASS | Details preserved selected URL `59579` |  |  |  |
| details thumbnail URL | PASS | `https://image-c.cdn.mangabox.me/.../manga_episode_grid_59579.png` |  |  |  |
| details author | PASS | 奏羽穂香, やぎかつみ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性, 一般, レディースコミック, ヒューマンドラマ, オリジナル |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【更新：水曜日（不定期）】DV、レイプ——18歳のほのかを襲う、苦難の日々。「あそこにはもう絶対に戻りたくない！」行き場を失った彼女が辿り着いた先は、ソープランド！すべては“本当の幸せ”を掴むために——。異色シンデレラストーリー、開幕！<br>※この物語はフィクションであり、実在の人物・団体・出来事などとは、一切関係ありません。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 219 chapters |  |  |  |
| chapter dates | PASS | 219 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.mangabox.me/.../image <redacted query values: d>` (image/jpeg, 226584 bytes, 800x1200) |  |  |  |
