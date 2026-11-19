# Extension Validation Report

- Extension: tachiyomi-all.baramangaonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4820009787408102796
- Source name: Bara Manga Online
- Source language: all
- Selected manga input: popular offset 0: [JPN] Rio リオ (SPICA Rio) – ××× Shinai to de Rarenai Heya ×××しないと出られない部屋 (`.../374963`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [JPN] Rio リオ (SPICA Rio) – ××× Shinai to de Rarenai Heya ×××しないと出られない部屋 (`.../374963`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | [CHI] Kuro クロ (Shiranui シラヌイ) – Xiàtiān! Dàhǎi! Zhèng Shì Luàn Jiāo Hǎo Shíjié! 夏天！大海！正是乱交好时节！ (`.../374234`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [JPN] Rio リオ (SPICA Rio) – ××× Shinai to de Rarenai Heya ×××しないと出られない部屋 (`.../374963`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [JPN] Rio リオ (SPICA Rio) – ××× Shinai to de Rarenai Heya ×××しないと出られない部屋 (`.../374963`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../374963`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[JPN\] Rio リオ (SPICA Rio) – ××× Shinai to de Rarenai Heya ×××しないと出られない部屋, URL=`374963` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://baramangaonline.com/.../Rio-%E3%83%AA%E3%82%AA-SPICA-Rio-%C3%97%C3%97%C3%97-Shinai-to-de-Rarenai-Heya-%C3%97%C3%97%C3%97%E3%81%97%E3%81%AA%E3%81%84%E3%81%A8%E5%87%BA%E3%82%89%E3%82%8C%E3%81%AA%E3%81%84%E9%83%A8%E5%B1%8B-01.jpg` (image/jpeg, 239589 bytes, 1055x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `374963` |  |  |  |
| details thumbnail URL | PASS | `https://baramangaonline.com/.../Rio-%E3%83%AA%E3%82%AA-SPICA-Rio-%C3%97%C3%97%C3%97-Shinai-to-de-Rarenai-Heya-%C3%97%C3%97%C3%97%E3%81%97%E3%81%AA%E3%81%84%E3%81%A8%E5%87%BA%E3%82%89%E3%82%8C%E3%81%AA%E3%81%84%E9%83%A8%E5%B1%8B-01.jpg` |  |  |  |
| details author | PASS | Rio リオ (SPICA Rio) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Furry |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Language:** Japanese |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://baramangaonline.com/.../Rio-%E3%83%AA%E3%82%AA-SPICA-Rio-%C3%97%C3%97%C3%97-Shinai-to-de-Rarenai-Heya-%C3%97%C3%97%C3%97%E3%81%97%E3%81%AA%E3%81%84%E3%81%A8%E5%87%BA%E3%82%89%E3%82%8C%E3%81%AA%E3%81%84%E9%83%A8%E5%B1%8B-01.jpg` (image/jpeg, 239589 bytes, 1055x1500) |  |  |  |
