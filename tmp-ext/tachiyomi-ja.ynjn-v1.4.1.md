# Extension Validation Report

- Extension: tachiyomi-ja.ynjn-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 29
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3322701627784242064
- Source name: Young Jump+
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../109`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | キングダム (`.../109`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 23 | サラマンダ (`.../38590`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | キングダム (`.../109`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | キングダム (`.../109`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | 第1話 無名の少年 (`.../13670`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`109` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.ynjn.jp/.../thumbnail_kingdom_2602_20th.png` (image/png, 171963 bytes, 501x501) |  |  |  |
| details identity | PASS | Details preserved selected URL `109` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://public.ynjn.jp/.../08X10000000073494500_cover_1.jpg` (image/jpeg, 1626237 bytes, 1440x2048; server Content-Type: application/octet-stream) |  |  |  |
| details author | PASS | \[原泰久\] |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | バトル, アクション |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 時は紀元前――。いまだ一度も統一されたことのない中国大陸は、500年の大戦争時代。苛烈な戦乱の世に生きる少年・信は、自らの腕で天下に名を成すことを目指す!!【※アプリ配信用に一部修正を入れております】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices must start at 0 and increase by 1. Page 1 uses index 1. Page 2 uses index 2. Page 3 uses index 3. Page 4 uses index 5. Page 5 uses index 6. Page 6 uses index 7. Page 7 uses index 8. Page 8 uses index 9. Page 9 uses index 10. Page 10 uses index 11. Page 11 uses index 12. Page 12 uses index 13. Page 13 uses index 14. Page 14 uses index 15. Page 15 uses index 16. Page 16 uses index 17. Page 17 uses index 18. Page 18 uses index 19. Page 19 uses index 20. Page 20 uses index 21. Page 21 uses index 22. Page 22 uses index 23. Page 23 uses index 24. Page 24 uses index 25. Page 25 uses index 26. Page 26 uses index 27. Page 27 uses index 28. Page 28 uses index 29. Page 29 uses index 30. Page 30 uses index 31. Page 31 uses index 32. Page 32 uses index 33. Page 33 uses index 34. Page 34 uses index 35. Page 35 uses index 36. Page 36 uses index 37. Page 37 uses index 38. Page 38 uses index 39. Page 39 uses index 40. Page 40 uses index 41. Page 41 uses index 42. Page 42 uses index 43. Page 43 uses index 44. Page 44 uses index 45. Page 45 uses index 46. Page 46 uses index 47. Page 47 uses index 48. Page 48 uses index 49. Page 49 uses index 50. Page 50 uses index 51. Page 51 uses index 52. Page 52 uses index 53. Page 53 uses index 54. Page 54 uses index 55. |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://public.ynjn.jp/.../08_877079_877079_1_003_001.webp` (image/jpeg, 445006 bytes, 840x1200; server Content-Type: binary/octet-stream) |  |  |  |
