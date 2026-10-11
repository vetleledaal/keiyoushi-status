# Extension Validation Report

- Extension: tachiyomi-ja.comicmeteor-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7760875295931980663
- Source name: Kiraboshi
- Source language: ja
- Selected manga input: popular offset 0: 継母レレーナは噂の悪女 (`.../mamahaha`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 741 | 継母レレーナは噂の悪女 (`.../mamahaha`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 継母レレーナは噂の悪女 (`.../mamahaha`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 継母レレーナは噂の悪女 (`.../mamahaha`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 第1話 (`.../2022134`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 741 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=継母レレーナは噂の悪女, URL=`.../mamahaha` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 742/742 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 742/742 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kirapo.jp/.../thumbnail_ec0ec4fc7b993324.avif` (image/avif (format: avif), 54454 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mamahaha` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 原作：花菱ういろ, 構成：ふじた里奈, 作画：Midori |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 異世界・ファンタジー, ラブストーリー |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「私の結婚相手が娘にデレデレ激甘パパなんて、もっと聞いてな――い！」保育士として働く玲奈（れな）は、忙しい毎日にやりがいを感じながらも、温かな家庭を持つことに密かに憧れを抱いていた。しかしある日、玲奈は車にひかれそうになった子どもをかばって事故で命を落としてしまう。そして、次に目を覚ました時には――“稀代の悪女”と呼ばれる令嬢レレーナに転生していた。さらにレレーナは、“戦場の悪魔”と恐れられるウェルバート公爵に嫁ぐこととなっており――？逃げ場のない状況に結婚する覚悟を決めた、玲奈ことレレーナだったが、ウェルバート公爵は噂とはかなり違うようで……？稀代の悪女、戦場の悪魔、天使――。まるっきりバラバラの三人が家族になるまでの物語。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kirapo.jp/.../0001.ptimg.json` (image/jpeg, 493861 bytes, 1138x1598) |  |  |  |
