# Extension Validation Report

- Extension: tachiyomi-id.komikcast-v1.6.83
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 972717448578983812
- Source name: VoraToon
- Source language: id
- Selected manga input: popular offset 0: Island of Stars and Chains (`.../island-of-stars-and-chains`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Island of Stars and Chains (`.../island-of-stars-and-chains`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Monsters Fight Monsters (`.../monsters-fight-monsters`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Kidnapped Dragons (`.../kidnapped-dragon`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Titan Forge (`.../titan-forge`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Island of Stars and Chains (`.../island-of-stars-and-chains`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Island of Stars and Chains (`.../island-of-stars-and-chains`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Chapter 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Island of Stars and Chains, URL=`.../island-of-stars-and-chains` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cvr.voratoon.id/.../cOVERbINTANG.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/webp (encoding: lossy), 99526 bytes, 720x1013) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../island-of-stars-and-chains` |  |  |  |
| details thumbnail URL | PASS | `https://cvr.voratoon.id/.../cOVERbINTANG.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` |  |  |  |
| details author | PASS | 어패류메기 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, School Life, Supernatural, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ikatan keluarga bisa menjadi penunjuk jalan bagai bintang di malam hari, atau justru rantai yang menyeret kita jatuh. Bagi Gi Seunghyun yang bercita-cita menjadi seorang hunter, kedua hal itu sama benarnya. Ia bermimpi menjadi hunter legendaris seperti ayahnya, terlepas dari rasa sakit hati atas perhatian keluarganya yang sepenuhnya tertuju pada adiknya yang koma, Sohyun. Semua berubah saat Sohyun mendadak sadar dan terungkap sebagai seorang ‘Returnee’—seseorang yang memiliki kemampuan dahsyat hasil dari bertransmigrasi ke dunia lain selama terbaring koma. Menyadari bahwa ia harus menjadi lebih kuat demi melindungi adiknya, tidak ada tempat yang lebih tepat bagi Seunghyun selain Akademi Bakat Khusus Seonghan. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.voratoon.com/.../001.jpg` (image/jpeg, 738914 bytes, 720x5217) |  |  |  |
