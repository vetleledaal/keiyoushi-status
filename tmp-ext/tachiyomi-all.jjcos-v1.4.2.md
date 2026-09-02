# Extension Validation Report

- Extension: tachiyomi-all.jjcos-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5763134940669279175
- Source name: JJCOS
- Source language: all
- Selected manga input: popular offset 0: Ami Yamazaki 山崎あみ, FRIDAYデジタル写真集 「美脚クライマックス vol.2 138ページ完全版」 Set.02 (`.../Ami%20Yamazaki%20%E5%B1%B1%E5%B4%8E%E3%81%82%E3%81%BF,%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E7%BE%8E%E8%84%9A%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%9E%E3%83%83%E3%82%AF%E3%82%B9%20vol.2%20138%E3%83%9A%E3%83%BC%E3%82%B8%E5%AE%8C%E5%85%A8%E7%89%88%E3%80%8D%20Set.02`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Ami Yamazaki 山崎あみ, FRIDAYデジタル写真集 「美脚クライマックス vol.2 138ページ完全版」 Set.02 (`.../Ami%20Yamazaki%20%E5%B1%B1%E5%B4%8E%E3%81%82%E3%81%BF,%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E7%BE%8E%E8%84%9A%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%9E%E3%83%83%E3%82%AF%E3%82%B9%20vol.2%20138%E3%83%9A%E3%83%BC%E3%82%B8%E5%AE%8C%E5%85%A8%E7%89%88%E3%80%8D%20Set.02`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Cosplay Hokunaimeko 北乃芽子 – Eula Race Queen (`.../Cosplay%20Hokunaimeko%20%E5%8C%97%E4%B9%83%E8%8A%BD%E5%AD%90%20%E2%80%93%20Eula%20Race%20Queen`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ami Yamazaki 山崎あみ, FRIDAYデジタル写真集 「美脚クライマックス vol.2 138ページ完全版」 Set.02 (`.../Ami%20Yamazaki%20%E5%B1%B1%E5%B4%8E%E3%81%82%E3%81%BF,%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E7%BE%8E%E8%84%9A%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%9E%E3%83%83%E3%82%AF%E3%82%B9%20vol.2%20138%E3%83%9A%E3%83%BC%E3%82%B8%E5%AE%8C%E5%85%A8%E7%89%88%E3%80%8D%20Set.02`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ami Yamazaki 山崎あみ, FRIDAYデジタル写真集 「美脚クライマックス vol.2 138ページ完全版」 Set.02 (`.../Ami%20Yamazaki%20%E5%B1%B1%E5%B4%8E%E3%81%82%E3%81%BF,%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E7%BE%8E%E8%84%9A%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%9E%E3%83%83%E3%82%AF%E3%82%B9%20vol.2%20138%E3%83%9A%E3%83%BC%E3%82%B8%E5%AE%8C%E5%85%A8%E7%89%88%E3%80%8D%20Set.02`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../Ami%20Yamazaki%20%E5%B1%B1%E5%B4%8E%E3%81%82%E3%81%BF,%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E7%BE%8E%E8%84%9A%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%9E%E3%83%83%E3%82%AF%E3%82%B9%20vol.2%20138%E3%83%9A%E3%83%BC%E3%82%B8%E5%AE%8C%E5%85%A8%E7%89%88%E3%80%8D%20Set.02`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ami Yamazaki 山崎あみ, FRIDAYデジタル写真集 「美脚クライマックス vol.2 138ページ完全版」 Set.02, URL=`.../Ami%20Yamazaki%20%E5%B1%B1%E5%B4%8E%E3%81%82%E3%81%BF,%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E7%BE%8E%E8%84%9A%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%9E%E3%83%83%E3%82%AF%E3%82%B9%20vol.2%20138%E3%83%9A%E3%83%BC%E3%82%B8%E5%AE%8C%E5%85%A8%E7%89%88%E3%80%8D%20Set.02` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../AMIKYAKU22_1.webp` (image/jpeg, 216731 bytes, 1200x1800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Ami%20Yamazaki%20%E5%B1%B1%E5%B4%8E%E3%81%82%E3%81%BF,%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E7%BE%8E%E8%84%9A%E3%82%AF%E3%83%A9%E3%82%A4%E3%83%9E%E3%83%83%E3%82%AF%E3%82%B9%20vol.2%20138%E3%83%9A%E3%83%BC%E3%82%B8%E5%AE%8C%E5%85%A8%E7%89%88%E3%80%8D%20Set.02` |  |  |  |
| details thumbnail URL | PASS | `https://i1.wp.com/.../AMIKYAKU22_1.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Japan, Ami Yamazaki 山崎あみ, ＦＲＩＤＡＹデジタル写真集 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i1.wp.com/.../AMIKYAKU22_1.webp` (image/jpeg, 216731 bytes, 1200x1800) |  |  |  |
