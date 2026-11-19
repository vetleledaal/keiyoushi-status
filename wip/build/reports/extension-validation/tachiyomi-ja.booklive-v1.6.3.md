# Extension Validation Report

- Extension: tachiyomi-ja.booklive-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7845281380500415137
- Source name: BookLive
- Source language: ja
- Selected manga input: popular offset 0: 敵国の公爵様に愛されすぎて暗殺できません！ (`.../10012878`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 敵国の公爵様に愛されすぎて暗殺できません！ (`.../10012878`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 100 | 信長協奏曲 (`.../183297`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 100 | 昭和の不思議101 (`.../2230832`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | 騎士令嬢はまだ恋を知らない～孤独な殿下の想いに触れて、真実の愛を知りました～ (`.../10019465`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 敵国の公爵様に愛されすぎて暗殺できません！ (`.../10012878`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 敵国の公爵様に愛されすぎて暗殺できません！ (`.../10012878`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | （１） (`.../001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=敵国の公爵様に愛されすぎて暗殺できません！, URL=`10012878` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 401/401 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 401/401 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://res.booklive.jp/.../X.jpg` (image/jpeg, 1292305 bytes, 1140x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `10012878` |  |  |  |
| details thumbnail URL | PASS | `https://res.booklive.jp/.../X.jpg` |  |  |  |
| details author | PASS | 藍川さくら, 琴子, エトワール編集部 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性マンガ, 広告で人気の本, ブックライブオリジナル, ファンタジー, ラブストーリー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「俺はあなたと夫婦ごっこをするつもりはありません」こんな美形を誘惑しろなんて…嘘でしょう！？ ウィレット王国の第二王女レティシアは、義母や義姉に虐げられる日々を過ごしていた。そんなある日、義母から突如隣国最強の騎士・シルヴェスター公爵の暗殺を命じられる。病床にある実の妹を人質に取られたレティシアは、言われるがまま公爵と結婚し、誘惑して近づくことに。 だが、いざ対面した公爵様は強烈な美形。そのうえレティシアに冷たい態度…。けれどそんなことでめげてはいられない。妹のために、どんな手を使っても籠絡してやるんだから…！ 「一度だけでも、抱いてくれませんか？」新婚初夜にそう迫れば、公爵が見せたのは意外な反応で…？ テレビ朝日の漫画バラエティ番組「バズマンTV」発！ 人気作家・琴子と漫画家・藍川さくらが贈る、 クールな最強騎士公爵と虐げられ王女の、キケンで甘い政略結婚から始まる異世界ラブストーリー。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | LINT | All 14 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=14 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://booklive.jp/.../keyword <redacted query values: sort and page_no>` to `https://booklive.jp/.../keyword <redacted query values: sort>` (1 redirects); popular: `https://booklive.jp/.../keyword <redacted query values: sort and page_no>` to `https://booklive.jp/.../keyword <redacted query values: sort>` (1 redirects); popular: `https://booklive.jp/.../10012878` to `https://booklive.jp/.../001` (1 redirects); popular: `https://booklive.jp/.../keyword <redacted query values: keyword, sort, and page_no>` to `https://booklive.jp/.../keyword <redacted query values: keyword and sort>` (1 redirects) |  |  |  |
| page load | PASS | `https://binb.booklive.jp/.../sbcGetImg.php <redacted query values: cid, src, p, q, vm, and dmytime>` (image/jpeg, 514842 bytes, 1140x1600) |  |  |  |
