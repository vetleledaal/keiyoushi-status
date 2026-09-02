# Extension Validation Report

- Extension: tachiyomi-id.manhwaindo-v1.4.43
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
- Source ID: 862941840467210819
- Source name: Manhwa Indo
- Source language: id
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Lookism (`.../lookism`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Pick Me Up, Infinite Gacha (`.../pick-me-up-infinite-gacha`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Garuru Girl (`.../garuru-girl`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Hell’s Tormentor Kraken (Gokusotsu Kraken) (`.../hells-tormentor-kraken-gokusotsu-kraken`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Lookism (`.../lookism`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 620 | Chapter 1 (`.../lookism-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 105 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`.../lookism` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://kacu.gmbr.pro/.../thumbnail.jpg` (image/jpeg, 13934 bytes, 224x319) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lookism` |  |  |  |
| details thumbnail URL | PASS | `http://kacu.gmbr.pro/.../thumbnail.jpg` |  |  |  |
| details author | PASS | Park Tae Joon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Manhwa Lookism yang dibuat oleh komikus bernama Park Tae Joon ini bercerita tentang Park Hyung Suk, kelebihan berat badan dan tidak menarik, diintimidasi dan dilecehkan setiap hari. Tapi keajaiban akan segera terjadi.<br><br>Alternative Names: 外見至上主義, 看臉時代, 외모지상주의 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 620 chapters |  |  |  |
| chapter dates | LINT | All 620 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=620 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices must start at 0 and increase by 1. Page 2 uses index 2. Page 3 uses index 4. Page 4 uses index 6. Page 5 uses index 8. Page 6 uses index 10. Page 7 uses index 12. Page 8 uses index 14. Page 9 uses index 16. Page 10 uses index 18. Page 11 uses index 20. Page 12 uses index 22. Page 13 uses index 24. Page 14 uses index 26. Page 15 uses index 28. Page 16 uses index 30. Page 17 uses index 32. Page 18 uses index 34. Page 19 uses index 36. Page 20 uses index 38. Page 21 uses index 40. Page 22 uses index 42. Page 23 uses index 44. Page 24 uses index 46. Page 25 uses index 48. Page 26 uses index 50. Page 27 uses index 52. Page 28 uses index 54. Page 29 uses index 56. Page 30 uses index 58. Page 31 uses index 60. Page 32 uses index 62. Page 33 uses index 64. Page 34 uses index 66. Page 35 uses index 68. Page 36 uses index 70. Page 37 uses index 72. Page 38 uses index 74. Page 39 uses index 76. Page 40 uses index 78. Page 41 uses index 80. Page 42 uses index 82. Page 43 uses index 84. Page 44 uses index 86. Page 45 uses index 88. Page 46 uses index 90. Page 47 uses index 92. Page 48 uses index 94. Page 49 uses index 96. Page 50 uses index 98. Page 51 uses index 100. Page 52 uses index 102. Page 53 uses index 104. Page 54 uses index 106. Page 55 uses index 108. Page 56 uses index 110. Page 57 uses index 112. Page 58 uses index 114. Page 59 uses index 116. Page 60 uses index 118. Page 61 uses index 120. Page 62 uses index 122. Page 63 uses index 124. Page 64 uses index 126. Page 65 uses index 128. Page 66 uses index 130. Page 67 uses index 132. Page 68 uses index 134. Page 69 uses index 136. Page 70 uses index 138. Page 71 uses index 140. Page 72 uses index 142. Page 73 uses index 144. Page 74 uses index 146. Page 75 uses index 148. Page 76 uses index 150. Page 77 uses index 152. Page 78 uses index 154. Page 79 uses index 156. Page 80 uses index 158. Page 81 uses index 160. Page 82 uses index 162. Page 83 uses index 164. Page 84 uses index 166. Page 85 uses index 168. Page 86 uses index 170. Page 87 uses index 172. Page 88 uses index 174. Page 89 uses index 176. Page 90 uses index 178. Page 91 uses index 180. Page 92 uses index 182. Page 93 uses index 184. Page 94 uses index 186. Page 95 uses index 188. Page 96 uses index 190. Page 97 uses index 192. Page 98 uses index 194. Page 99 uses index 196. Page 100 uses index 198. Page 101 uses index 200. Page 102 uses index 202. Page 103 uses index 204. Page 104 uses index 206. Page 105 uses index 208. |  |  |  |
| page URLs | PASS | 105 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://kacu.gmbr.pro/.../1.jpg` (image/jpeg, 29251 bytes, 700x1000) |  |  |  |
