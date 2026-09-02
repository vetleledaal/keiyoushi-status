# Extension Validation Report

- Extension: tachiyomi-ja.amebamanga-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2623577517578458051
- Source name: Ameba Manga
- Source language: ja
- Selected manga input: latest offset 0: エリート同期のいじわるなキス (`.../922847`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 契約婚した相手が鬼宰相でしたが、この度宰相室専任補佐官に任命された地味文官（変装中）は私です。 (`.../871435`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | 「くじ」から始まる婚約生活～厳正なる抽選の結果、笑わない次期公爵様の婚約者に当選しました～ (`.../296344`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | エリート同期のいじわるなキス (`.../922847`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | 救世の騎士姫　ファラン【マイクロ】 (`.../950118`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | エリート同期のいじわるなキス 分冊版 (`.../922848`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | エリート同期のいじわるなキス (`.../922847`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | エリート同期のいじわるなキス ： 1 (`.../3202782`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 95 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=エリート同期のいじわるなキス, URL=`922847` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 202/202 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 202/202 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stat.dokusho-ojikan.jp/.../d60cd7bb-4782-4c5c-bfb7-55c5972c2740.jpg` (image/jpeg, 61881 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `922847` |  |  |  |
| details thumbnail URL | PASS | `https://stat.dokusho-ojikan.jp/.../d60cd7bb-4782-4c5c-bfb7-55c5972c2740.jpg` |  |  |  |
| details author | PASS | 猫又しょう, 白石さよ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【難攻不落の冷徹エース × 恋愛下手シゴデキ女子! 不器用な2人の社内きゅんラブ!!】 <br>結婚の約束をした会社の先輩に捨てられた成瀬紗衣。失意のどん底にいた彼女が失恋の夜に出会ったのは、イケメンで仕事もできる社内一の冷徹男、戸川凌介だった。<br>恋より仕事に生きよう。そう決めた紗衣なのに、なぜが彼女を気にかけてくれる凌介。そして元カレが見ている前で突然、紗衣に「あること」をしてきて…!?<br>※第1～3話を収録<br><br>Publisher: 双葉社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 95 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ebook.dokusho-ojikan.jp/.../1.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 397799 bytes, 1125x1600) |  |  |  |
