# Extension Validation Report

- Extension: tachiyomi-ja.unext-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1896940876613282856
- Source name: U-NEXT
- Source language: ja
- Selected manga input: popular offset 0: 小悪魔教師サイコ (`.../BSD0000722100`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 小悪魔教師サイコ (`.../BSD0000722100`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 雑用付与術師が自分の最強に気付くまで（コミック） (`.../BSD0000935503`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 最強のレベル0 -解析スキルで完全無双- (`.../BSD0001060709`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | センセイ、魔王を殺して (`.../BSD0001098843`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | 小悪魔教師サイコ (`.../BSD0000722100`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 小悪魔教師サイコ (`.../BSD0000722100`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 177 | 第１話 (`.../BID0001243340`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: This service can only be used from Japan. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: This service can only be used from Japan. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=小悪魔教師サイコ, URL=`BSD0000722100` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://metac.nxtv.jp/.../hol0002443_2596.jpg` (image/jpeg, 565931 bytes, 1242x1869) |  |  |  |
| details identity | PASS | Details preserved selected URL `BSD0000722100` |  |  |  |
| details thumbnail URL | PASS | `https://metac.nxtv.jp/.../hol0002443_2596.jpg` |  |  |  |
| details author | PASS | 原作: 三石メガネ, 原作: peep, 制作: taskey STUDIO |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 高校教師が生徒からのイジメにより入院した。代わりに新しく赴任した葛西先生は、美人でスタイル抜群。そのうえ天然で、きわどいトークにもニコニコ応じてくれる。「私が教師になったのは生徒を幸せにするため」と笑う彼女にまで、悪い生徒たちの魔の手が忍び寄る。しかし生徒たちは知らなかった――葛西先生は、サイコパスだと。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 177 chapters |  |  |  |
| chapter dates | PASS | 177 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This service can only be used from Japan. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
