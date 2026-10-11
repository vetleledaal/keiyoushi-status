# Extension Validation Report

- Extension: tachiyomi-ja.comicroombase-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 1887776535756811938
- Source name: Comic Room Base
- Source language: ja
- Selected manga input: popular offset 0: 能ある夫人は離縁届けを叩きつける (`.../b93d949e5a60b`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 能ある夫人は離縁届けを叩きつける (`.../b93d949e5a60b`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | ノミの心臓のおっさん、竜の心臓を手に入れる。 (`.../4523092b43ad6`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 恋と地獄 (`.../7ce718b58af66`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 能ある夫人は離縁届けを叩きつける (`.../b93d949e5a60b`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 能ある夫人は離縁届けを叩きつける (`.../b93d949e5a60b`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 56 | 離縁しましょう (`.../003e1ef4446f6`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=能ある夫人は離縁届けを叩きつける, URL=`b93d949e5a60b` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202510271418212084810783A7D412AA2DD168C32A2FE2122-lg.webp` (image/webp (encoding: lossy), 34100 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `b93d949e5a60b` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202510271418212084810783A7D412AA2DD168C32A2FE2122.png` (image/png, 3356698 bytes, 2560x1344) |  |  |  |
| details author | PASS | 桃月はち／COMIC ROOM |  |  |  |
| details artist | PASS | 桃月はち／COMIC ROOM |  |  |  |
| details genres | PASS | ヒューマンドラマ, お仕事, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 男尊女卑が色濃く残る国で、男爵夫人ガブリエルは女性ながらに帽子屋を経営していた。<br>商売は軌道に乗り、彼女の日々は忙しくも充実していたのだが、酒、女、ギャンブル、全てを嗜む夫のジャックに突如、店の仕入れ金を全て奪い取られる。<br>憤りを感じつつも理由を尋ねると、なんと彼は外で愛人を作り、それだけでなく、懐妊までさせていることが発覚。<br>さらに、その子供のために仕入れ金を使うだけでなく、ガブリエルが一から築き上げた店を継がせようと企んでいた。<br>そんなジャックの横暴に堪忍袋の尾が切れたガブリエルは離縁届を叩きつけ心に誓う。<br>「わからないなら、わからせてやる。女の力を……いえ、私の力を！」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 56 chapters |  |  |  |
| chapter dates | PASS | 56 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comic-room-base.com/.../master-1760591842446-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 6, 3, 5, 1, 10, 11, 9, 14, 13, 7, 2, 12, 15, 4, 0\]` (image/jpeg, 489725 bytes, 1125x1600) |  |  |  |
