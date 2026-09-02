# Extension Validation Report

- Extension: tachiyomi-ja.comicgrast-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 218928749727744731
- Source name: Comic Grast
- Source language: ja
- Selected manga input: popular offset 0: モブ魂～下っ端ザコキャラに転生したので、ゲーム知識で無双したら最強パーティができました～ (`.../n284`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | モブ魂～下っ端ザコキャラに転生したので、ゲーム知識で無双したら最強パーティができました～ (`.../n284`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 勇者パーティーをクビになった忍者、忍ばずに生きます (`.../n3`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | モブ魂～下っ端ザコキャラに転生したので、ゲーム知識で無双したら最強パーティができました～ (`.../n284`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | モブ魂～下っ端ザコキャラに転生したので、ゲーム知識で無双したら最強パーティができました～ (`.../n284`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | １話ｰ① (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=モブ魂～下っ端ザコキャラに転生したので、ゲーム知識で無双したら最強パーティができました～, URL=`.../n284` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://novema.jp/.../thumb.jpg <redacted query values: t>` (image/jpeg, 279076 bytes, 640x504) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../n284` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://novema.jp/.../main.jpg <redacted query values: t>` (image/jpeg, 853580 bytes, 1410x880) |  |  |  |
| details author | PASS | 作画／ウエ ノハラ, 原作／くーねるでぶる（戒め）,  |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | コミカライズ, 異世界, ファンタジー, 転生, 領主, ゲーム, 治癒魔法, 男主人公, モブキャラ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 苦悩の末に自ら命を絶った男の転生先は、やり込んでいたRPG「魔剣伝説」の序盤で死ぬザコモブの手下のD!? ディートフリートという名が明かされる前に死んでいく運命に嘆く中、ストーリーには出てこない妹と出会う。可愛い妹・リアを守るべく、下っ端ザコキャラには厳しすぎるシナリオに抗う事を決めたD。前世知識で仲間を鍛え、ゲーム知識で己の治癒魔法を予想外に覚醒させろ!! そしてどん底からの反逆はだんだんとシナリオを壊し始めて…!? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://novema.jp/.../cover.jpg <redacted query values: seed and size>` (image/jpeg, 321439 bytes, 1350x1920) |  |  |  |
