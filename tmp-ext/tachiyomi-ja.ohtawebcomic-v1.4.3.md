# Extension Validation Report

- Extension: tachiyomi-ja.ohtawebcomic-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1056568527385317039
- Source name: Ohta Web Comic
- Source language: ja
- Selected manga input: popular offset 0: 起承転転 (`.../kishotenten`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 起承転転 (`.../kishotenten`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 鉄工所にも花が咲く (`.../tekkoujo`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 起承転転 (`.../kishotenten`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 起承転転 (`.../kishotenten`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | 第1話　50歳の転機 (`.../64823`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=起承転転, URL=`.../kishotenten` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webcomic.ohtabooks.com/.../kishotenten-bnr.jpg` (image/jpeg, 77520 bytes, 960x388) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kishotenten` |  |  |  |
| details thumbnail URL | PASS | `https://webcomic.ohtabooks.com/.../kishotenten-bnr.jpg` |  |  |  |
| details author | PASS | 雁須磨子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 誰かの妻にもならず、誰かの母にもならず、 娘のまま50才になった。<br>50代、中年から初老へ。身体の不調、気力・体力・記憶力の減退、若者とのジェネレーションギャップ、親の介護問題、同世代の訃報……など “老い”のあれこれを突き付けられ、“加齢”に向き合う日々。 そんな50代に足を踏み入れた主人公・葉子の身に起こる「人生の新展開」。 仕事を辞めること。東京を離れること。何かをあきらめること。 ――何者にもなれなかった私が、新しい自分と出会う物語。<br>★2025.12.10：『このマンガがすごい！2026』オンナ編 第3位にランクインしました！ これを記念して『起承転転』特設サイトも公開中です。<br>★単行本未収録話はコミックシーモアで独占配信中。第1話・最新話は引き続き無料でお読みいただけます<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s3-ap-northeast-1.amazonaws.com/.../M_H.jpg <redacted query values: dmytime>` (image/jpeg, 220899 bytes, 987x1400) |  |  |  |
