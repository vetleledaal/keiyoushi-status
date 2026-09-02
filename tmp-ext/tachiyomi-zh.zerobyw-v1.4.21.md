# Extension Validation Report

- Extension: tachiyomi-zh.zerobyw-v1.4.21
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
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
- Source ID: 8743284448117690086
- Source name: zero搬运网
- Source language: zh
- Selected manga input: popular offset 0: Fate／stay night [Unlimited Blade Works] (`.../details <redacted query values: kuid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Fate／stay night [Unlimited Blade Works] (`.../details <redacted query values: kuid>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 对准枪口 (`.../details <redacted query values: kuid>`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Fate／stay night [Unlimited Blade Works] (`.../details <redacted query values: kuid>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fate／stay night [Unlimited Blade Works]  (`.../details <redacted query values: kuid>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 5 | 1 (`.../index.php <redacted query values: zjid>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 184 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fate／stay night \[Unlimited Blade Works\], URL=`.../details <redacted query values: kuid>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://tupa.zerobyw33.com/.../001.jpg` (image/jpeg, 265476 bytes, 1400x1991) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Fate／stay night \[Unlimited Blade Works\] to Fate／stay night \[Unlimited Blade Works\]  |  |  |  |
| details thumbnail URL | PASS | `http://tupa.zerobyw33.com/.../001.jpg` |  |  |  |
| details author | PASS | TYPE-MOON×森山大輔 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 作者: TYPE-MOON×森山大輔, 冒险, 奇幻, 一半中文一半生肉, 连载中, 收藏: 3, 人气: 36 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 七名魔术师与七名英灵订下契约，并参与争夺圣杯的「圣杯战争」。在魔术师家系中成长的远坂凛，为继承父亲参加圣杯战争的遗志，而尝试召唤最强的英灵剑兵。然而，现身于她面前的却是连自身名字都遗忘的英灵弓兵 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 184 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://tupa.zerobyw33.com/.../001.jpg` (image/jpeg, 349638 bytes, 1445x2048) |  |  |  |
