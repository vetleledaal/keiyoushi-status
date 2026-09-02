# Extension Validation Report

- Extension: tachiyomi-ja.coronaex-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4760608706245794364
- Source name: Corona EX
- Source language: ja
- Selected manga input: popular offset 0: 【特別短期連載】アイビーのつれづれなる日々 (`.../134208102547545`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 【特別短期連載】アイビーのつれづれなる日々 (`.../134208102547545`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Wiz～ニセ魔法使いの事件簿～ (`.../224248538677439`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 【特別短期連載】オールワークスメイドのお仕事日誌 (`.../256121032720611`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 欠けた月のメルセデス～吸血鬼の貴族に転生したけど捨てられそうなのでダンジョンを制覇する～@COMIC (`.../20000000054621`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 【特別短期連載】アイビーのつれづれなる日々 (`.../134208102547545`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 【特別短期連載】アイビーのつれづれなる日々 (`.../134208102547545`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 12 | 第1話 (`.../134218213246323`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=【特別短期連載】アイビーのつれづれなる日々, URL=`134208102547545` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.to-corona-ex.com/.../b25c8edbb7955777ea4e15dbf8fb92db <redacted query values: X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Security-Token, X-Amz-SignedHeaders, and X-Amz-Signature>` (image/jpeg, 184169 bytes, 679x960) |  |  |  |
| details identity | PASS | Details preserved selected URL `134208102547545` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.to-corona-ex.com/.../b25c8edbb7955777ea4e15dbf8fb92db <redacted query values: X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Security-Token, X-Amz-SignedHeaders, and X-Amz-Signature>` (image/jpeg, 184169 bytes, 679x960) |  |  |  |
| details author | PASS | 漫画: わかさこばと, 原作: ほのぼのる500, キャラクター原案: なま |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年マンガ, コロナ・コミックス, 特別短期連載, ファンタジー, 異世界・転生, ほのぼの |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | アニメ放送後に更新！（※配信日はTVアニメの放送に合わせて変更になる場合がございます）<br>アイビーとソラと仲間たちの「連れづれ」な日々を描く特別短期連載！<br>「乙女ゲームのヒロインで最強サバイバル@COMIC」（https://to-corona-ex.com/.../20000000054623%EF%BC%89%E3%81%AE%E3%82%8F%E3%81%8B%E3%81%95%E3%81%93%E3%81%B0%E3%81%A8%E5%85%88%E7%94%9F%E3%81%8C%E6%8F%8F%E3%81%8F%E3%80%81<br>賑やかで優しいアイビーの日常物語４コマ漫画です！<br><br><br>(C)Kobato Wakasa / Honobonoru500 / Nama<br><br>Alternative Title: アイビーノツレヅレナルヒビ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | LINT | All 12 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=12 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.to-corona-ex.com/.../4b50a4f7e97f328f514d3b3629695525 <redacted query values: drm_hash, Expires, Signature, and Key-Pair-Id>` (image/jpeg, 413218 bytes, 1125x1600) |  |  |  |
