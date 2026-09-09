# Extension Validation Report

- Extension: tachiyomi-pt.revistasequadrinhos-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1455091782657313638
- Source name: Revistas e Quadrinhos
- Source language: pt
- Selected manga input: popular offset 0: Mania por Melkormancin (`.../mania-por-melkormancin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Mania por Melkormancin (`.../mania-por-melkormancin`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Casa da Mãe Joana 39 – Fake Daddy (`.../casa-da-mae-joana-39-fake-daddy`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Au Naturel 26 por Pegasus Smith (`.../au-naturel-26-por-pegasus-smith`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Mom Help 83 por CrazyDad3D (`.../mom-help-83-por-crazydad3d`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | Mania por Melkormancin (`.../mania-por-melkormancin`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mania por Melkormancin (`.../mania-por-melkormancin`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo Único (`.../mania-por-melkormancin`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mania por Melkormancin, URL=`.../mania-por-melkormancin` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://revistasequadrinhos.com/.../capa-Melkor-Mania.jpg` (image/jpeg, 71208 bytes, 248x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mania-por-melkormancin` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics, HQ COMICS, MelkorMancin, Popular Comics, Quadrinhos Eróticos |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Entenda a Mania por Melkormancin, suas causas e como afeta o cotidiano das pessoas. Informação objetiva para todos os leitores. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://revistasequadrinhos.com/.../popular-comics` to `https://revistasequadrinhos.com/.../popular-comics` (1 redirects); popular_next: `https://revistasequadrinhos.com/.../2` to `https://revistasequadrinhos.com/.../2` (1 redirects); latest_next: `https://revistasequadrinhos.com/.../2` to `https://revistasequadrinhos.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://revistasequadrinhos.com/.../Melkor-Mania-01.webp` (image/webp (encoding: lossy), 41024 bytes, 1500x2294) |  |  |  |
