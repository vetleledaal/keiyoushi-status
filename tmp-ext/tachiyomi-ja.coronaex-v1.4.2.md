# Extension Validation Report

- Extension: tachiyomi-ja.coronaex-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4760608706245794364
- Source name: Corona EX
- Source language: ja
- Selected manga input: latest offset 0: 【特別短期連載】オールワークスメイドのお仕事日誌 (`.../256121032720611`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 【特別短期連載】アイビーのつれづれなる日々 (`.../134208102547545`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Wiz～ニセ魔法使いの事件簿～ (`.../224248538677439`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | 【特別短期連載】オールワークスメイドのお仕事日誌 (`.../256121032720611`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 【特別短期連載】オールワークスメイドのお仕事日誌 (`.../256121032720611`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 【特別短期連載】オールワークスメイドのお仕事日誌 (`.../256121032720611`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 【特別短期連載】オールワークスメイドのお仕事日誌 (`.../256121032720611`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | 第1話 (`.../262059896524993`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=【特別短期連載】オールワークスメイドのお仕事日誌, URL=`256121032720611` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.to-corona-ex.com/.../db673c7dc5f1e07ac2c5d181e9d016af <redacted query values: X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Security-Token, X-Amz-SignedHeaders, and X-Amz-Signature>` (image/jpeg, 206043 bytes, 679x960) |  |  |  |
| details identity | PASS | Details preserved selected URL `256121032720611` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.to-corona-ex.com/.../db673c7dc5f1e07ac2c5d181e9d016af <redacted query values: X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Security-Token, X-Amz-SignedHeaders, and X-Amz-Signature>` (image/jpeg, 206043 bytes, 679x960) |  |  |  |
| details author | PASS | 漫画: fufu, キャラクター原案: 雪子, 原作: あてきち |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女マンガ, 異世界・転生, ファンタジー, 特別短期連載 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | アニメ放送後に更新！（※配信日はTVアニメの放送に合わせて変更になる場合がございます）<br>世界一素敵なメイドを目指すメロディの日常を描いた特別短期連載！<br>fufu先生が描く、クスッと笑える４コマ漫画です！<br><br>(C) fufu / Atekichi<br><br>Alternative Title: オールワークスメイドノオシゴトニッシ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | LINT | All 11 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=11 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.to-corona-ex.com/.../798a0c2ee9ee1e4390ed86f528166027 <redacted query values: drm_hash, Expires, Signature, and Key-Pair-Id>` (image/jpeg, 437061 bytes, 1125x1600) |  |  |  |
